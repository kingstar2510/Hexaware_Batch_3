public class Box{
    int len;
    int height;
    int width;

    Box(){
        this.len = -1;
        this.height = -1;
        this.width = - 1;
    }

    Box(int side){
        this.width = side;
        this.height = side;
        this.len = side; 
    }

    Box(int len, int height, int width){
        this.len = len;
        this.height = height;
        this.width = width;
    }

    Box( Box old){
       this.len = old.len;
       this.height = old.height;
       this.width = old.width; 
    }

}