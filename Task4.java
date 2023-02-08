class Task5{
public static void main(String args[]){
Task5 t5 = new Task5();
t5.perform();
}
void perform(){
int num = 55;
if((num%5 == 0)&&(num%11 == 0)){
System.out.println(num +" is divisible by 5 and 11");				
}
else{
System.out.println("No! "+num+" is not divisible by 5 and 11");				
}

}
}

