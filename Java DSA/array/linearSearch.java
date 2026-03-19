public class linearSearch{

public static int arraylinear(int number[],int key){
    
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
    }
    return -1;
}

    public static void main(String [] args){
        int marks[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index = arraylinear(marks,key);
        if(index==-1){
        System.out.print("KEY NOT FOUND");

        }else{
        System.out.print("KEY IS AT " + index + " INDEX");
        }

    }
}