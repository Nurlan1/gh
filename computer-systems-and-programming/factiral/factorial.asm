global  _main
extern  _printf

section .data
    arraySize dd 5
    resultMessage db 'The result is: %d', 10, 0 
section .text
_main:
    xor ebx,ebx
    xor eax,eax
    mov eax,1
    mov ebx,1
    mov edx, [arraySize]
loop1:
    imul eax,ebx
    add ebx,1
    cmp ebx,edx     
    jle loop1

    push eax        
    push resultMessage 
    call _printf    
    add  esp, 8     

    ret 