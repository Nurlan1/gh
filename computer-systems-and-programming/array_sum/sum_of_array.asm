global  _main
extern  _printf

section .data
    array dd 1, 2, 3
    arraySize dd 3
    resultMessage db 'The result is: %d', 10, 0 
section .text
_main:
    xor ebx,ebx
    xor eax,eax
    mov ecx, array
    mov edx, [arraySize]
loop1:
    add eax, [ecx + ebx*4]
    add ebx,1
    cmp ebx, edx     
    jl loop1

    push eax        
    push resultMessage 
    call _printf    
    add  esp, 8     

    ret 