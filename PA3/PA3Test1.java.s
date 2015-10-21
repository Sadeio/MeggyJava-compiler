 .file  "main.java" 
 __SREG__ = 0x3f 
 __SP_H__ = 0x3e 
  __SP_L__ = 0x3d 
 __tmp_reg__ = 0 
 __zero_reg__ = 1 
 .global __do_copy_data 
 .global __do_clear_bss 
 .text 
 .global main 
.type   main, @function 
 main: 
 push r29 
 push r28 
 in r28,__SP_L__ 
 in r29,__SP_H__ 
 /* prologue: function */ 
 call _Z18MeggyJrSimpleSetupv 
 /* Need to call this so that the meggy library gets set up */


 
 # True/1 expression 
 ldi    r22, 1 
 # push one byte expression onto stack 
 push   r22 
 # load condition and branch if false 
 # load a one byte expression off  stack 
 pop    r24 
 #load zero into reg 
 ldi    r25, 0 
 #use cp to set SREG 
 cp     r24, r25 
 #WANT breq MJ_L0 
 brne  MJ_L1 
 jmp    MJ_L0
MJ_L0:
  # Load constant int  
 ldi    r24,lo8(1) 
 ldi    r25,hi8(1) 
 # push two byte expression onto stack 
 push   r25 
 push   r24 
 
 ### Meggy.delay() call 
 # load delay parameter 
 # load a two byte expression off stack 
 pop    r24 
 pop    r25 
 call   _Z8delay_msj 
 
jump MJ_L2
MJ_L2:
  


 /* epilogue start */ 
 endLabel:
 jmp endLabel 
 ret 
 .size   main, .-main 
