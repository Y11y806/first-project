package Student;

public class StudentTest {
    static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student("1","张三",18);
        Student s2 = new Student("2","李四",20);
        Student s3 = new Student("3","王五",19);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //添加一个学生对象，对学号进行唯一性判断
        Student s4 = new Student("4","钱五",22);
        //唯一性判断 存在--不存在
        boolean bl = contain(arr,s4);
        if(bl){//存在
            System.out.println("当前学号已存在，请修改id后再进行");
        }else {//不存在
            //数组 已存满--未存满
            int count = setCount(arr);
            if(count == arr.length){
                //已存满
                Student[] newarr = expandArray(arr);
                newarr[count] = s4;
                //添加后，遍历所有学生信息
                printArr(newarr);
            }else {
                //未存满
                arr[count] = s4;
                //添加后，遍历所有学生信息
                printArr(arr);
            }
        }

    }
    //打印数组内容
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("学号："+arr[i].id+"，名字："+arr[i].name+"，年龄："+arr[i].age);
        }
    }
    //扩展数组
    public static Student[] expandArray(Student[] arr) {
        Student[] newarr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
    //计数器
    public static int setCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    //检验学号的唯一性
    public static boolean contain(Student[] arr, Student s4){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu.id.equals(s4.id)){
                return true;
            }
        }
        return false;
    }


}
