class Task7{
public static void main(String args[]){
Task7 t7 = new Task6();
t7.perform();
}
void perform(){
char ch = '$';

if((ch>='A' && ch<='z') || (ch>='a' &&ch<='z')){
System.out.println("This is a character");
}
else if(ch>=0 && ch<=9){
System.out.println("This is a digit");
}
else{
System.out.println("This is a Special Character");
}
}
}

