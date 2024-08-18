public class dd_OOP_the_reserved_word_THIS {
    private int base, height, answer;
    public dd_OOP_the_reserved_word_THIS(int base, int height){
        this.base = base;
        this.height = height;
    }
    public void operation(){
        answer = base * height;
    }
    public void print(){
        operation();
        System.out.println("The area of the rectangle is: " + answer + " cm2");
    }
}
