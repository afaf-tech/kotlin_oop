package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

// manual
//fun validateReq(request: CreateProductRequest){
//    if(request.id ==""){
//        throw ValidationException("id is blank")
//    }else if(request.name==""){
//        throw ValidationException("name is blank")
//    }
//}


fun validateReq(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    //  iterate satu2 kalo ada anotation @NotBlank
    for(property in properties){
        if(property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when(value){
                is String -> {
                    if(""== value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }

}

fun main() {
    val request = CreateProductRequest("1", "mie sedap", 2000)
    validateReq(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateReq(request2)
}