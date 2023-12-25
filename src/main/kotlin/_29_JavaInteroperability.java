package main.kotlin;

public class _29_JavaInteroperability {

    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
//    calling kotlin method:
//        System.out.println(
//                _29_Java_Interoperability_calling_kotlin_func_from_java_file_and_vice_versaKt
//                        .add(5,6)); // this will show error because we have changed .class name
//                      through @file: Jvm("customFileName").

//        so we have to use that file name to call method of that file:

        System.out.println(KotlinInteroperability.add(6,7));

//        calling default function volume() of 30th file:
        System.out.println(KotlinInteroperability2.findVolume(4,8));
    }
}
