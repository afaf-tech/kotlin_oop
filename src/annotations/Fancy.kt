package annotations


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
// 1. tidak bisa memiliki member( function / properties) di dalam bodyinya
annotation class Fancy (val author:String)