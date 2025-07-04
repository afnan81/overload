class Student{

    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id,String name){
       this.id=id;
       this.name=name;
    }
    Student(int id,String name,float stipend){
        this.id=id;
        this.name=name;
        this.stipend=stipend;

    }
    void Displaydetails(){
        System.out.println(this.id + "|" + this.name + "|"+ this.stipend +"|");

    }

}

class main{
    public static void main(String[] args)
    {
       Student st1=new Student ();
       Student st2=new Student(45,"Afnan");
       Student st3=new Student(234,"cody",1000);


       st1.Displaydetails();
       st2.Displaydetails();
       st3.Displaydetails();
    }

}