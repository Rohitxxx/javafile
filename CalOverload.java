class CalOverload {
    public void add(int a,int b){
        int t;
        t=a+b;
        System.out.println(t);
    }
    public void add(float a,float b){
        float t;
        t=a+b;
        System.out.println(t);

    }
    public void add(float a,int b){
        float t;
        t=a+b;
        System.out.println(t);
    }
    public void add(int a,int b,int c){
        int t;
        t=a+b+c;
        System.out.println(t);
    }
    public static void main(String args[]){
        CalOverload cal=new CalOverload();
        cal.add(20,39);
        cal.add(40.4f,34.7f);
        cal.add(55.4f,90);
        cal.add(10,20,30);
    }
}