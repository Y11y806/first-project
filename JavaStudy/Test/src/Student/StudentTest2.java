package Student;

public class StudentTest2 {
    static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student("1", "张三", 18);
        Student s2 = new Student("2", "李四", 20);
        Student s3 = new Student("3", "王五", 19);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //通过id删除学生信息 -- 存在，不存在
        int bln = contain(arr, "2");
        if (bln != -1) {
            //存在
            arr[bln] = null;
            //删后遍历信息
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    System.out.println("学号：" + arr[i].id + "，名字：" + arr[i].name + "，年龄：" + arr[i].age);
                }
            }
        } else {
            System.out.println("此学号不存在");
        }
        //查询id，将对应年龄+1
        int bl = contain(arr, "1");
        if (bl != -1) {
            //存在
            arr[bl].age++;
            System.out.println("学号：" + arr[bl].id + "，名字：" + arr[bl].name + "，年龄：" + arr[bl].age);
        } else {
            System.out.println("此学号不存在");
        }


    }

    //是否存在要删除的索引
    public static int contain(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Student stu = arr[i];
                if (stu.id.equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }

}