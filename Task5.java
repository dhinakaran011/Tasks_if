class Task6{
public static void main(String args[]){
Task6 t6 = new Task6();
t6.perform();
}
void perform(){
char ch = 'S';

if(ch>='A' && ch<='z') || (ch>='a' &&ch<='z'){
System.out.println("Yes, this is a character");
}
else{
System.out.println("No, this is not a character");
}
}
}

