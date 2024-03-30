
        
define i32 @main(){
	
    entry:
	%n = i32 5
	%f = i32 1
	%i = global i32 1
        br label %factorial
        
    factorial:
        @f=mul @f, @i
        @i = add i32 @i,1
        %cmp_result= icmp sge i32 @i, @n
        br i1 cmp_result, label factorial, label %end
    end:
    
    call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @formatString , i32 0, i32 0), i32 @f)

    ret i32 1
    

}