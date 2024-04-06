; External declaration of printf to allow printing
declare i32 @printf(i8*, ...)

; A global variable for the format string used by printf
@formatString = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1

define i32 @main() {
entry:
  ; Initialize variables
  %n = alloca i32, align 4
  store i32 5, i32* %n
  %f = alloca i32, align 4
  store i32 1, i32* %f
  %i = alloca i32, align 4
  store i32 1, i32* %i

  br label %loop

loop: ; The factorial calculation loop
  %i_val = load i32, i32* %i
  %n_val = load i32, i32* %n
  %cmp = icmp sle i32 %i_val, %n_val
  br i1 %cmp, label %loop_body, label %end

loop_body:
  %f_val = load i32, i32* %f
  %new_f = mul i32 %f_val, %i_val
  store i32 %new_f, i32* %f
  %new_i = add i32 %i_val, 1
  store i32 %new_i, i32* %i
  br label %loop

end: ; Print the result
  %f_final = load i32, i32* %f
  %fmt = getelementptr inbounds [4 x i8], [4 x i8]* @formatString, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %fmt, i32 %f_final)

  ret i32 0
}