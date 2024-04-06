declare i32 @printf(i8*, ...)

@formatString = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1

define i32 @main(){
	
    entry:
	%n = alloca i32, align 4
    store i32 5, i32* %n
    %f = alloca i32, align 4
    store i32 1, i32* %f
    %i = alloca i32, align 4
    store i32 1, i32* %i
    

    br label %factorial
        
    factorial:
        %val_f = load i32, i32* %f
        %val_i = load i32, i32* %i
        %val_n = load i32, i32* %n, align 4
        %result = mul i32 %val_f, %val_i
        store i32 %result, i32* %f
        %result_i = add i32 %val_i,1
        store i32 %result_i, i32* %i
        %cmp_result= icmp sge i32 %val_i, %val_n
        br i1 %cmp_result, label %factorial, label %end
    end:
    
        call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @formatString , i32 0, i32 0), i32 %val_f)

    ret i32 1
    

}