disp macro msg
        mov ah,09h
        lea dx,msg
        int 21h
endm
data segment
        str1 db "NITIN$"
        str2 db 100 dup('$')
        msg1 db "original string =$"
        msg2 db "copied string =$"
        newl db 10,13,"$"
        same db "same strings$"
        diff db "different strings$"
        msgg db "enter a string: $"
        counter dw 0000h
data ends
code segment
assume cs:code,ds:data
start:
        mov dx,data
        mov ds,dx
        mov es,dx
       ; disp msgg;ask user to enter string
        ;mov ah,0Ah
        ;lea dx,str1
        ;int 21h

        mov cx,0000h
        lea si,str1
up:     mov al,[si]
        cmp al,'$'
        je next
        inc si
        inc cx
        jmp up
next:   lea di,str2
        mov counter,cx
        dec si
up1:    mov al,[si]
        mov [di],al
        dec si
        inc di
        loop up1
        disp msg1
        disp str1
        disp newl
        disp msg2
        disp str2

        lea si,str1
        lea di,str2
        mov cx,counter
repeat: mov al,[si]
        mov bl,[di]
        cmp al,bl
        jne wrong
        inc si
        inc di
        loop repeat
        jmp correct
wrong:  disp newl
        disp diff
        mov ah,4ch
        int 21h
correct:disp newl
        disp same
        mov ah,4ch
        int 21h
code ends
end start
