
class instance {

    int num;        //instance variable

    instance(int n) {
        num = n;
    }

    public void Show() {
        System.out.println("The number is : " + num);
    }

    public static void main(String[] args) {
        instance test = new instance(75);
        test.Show();
    }
}
