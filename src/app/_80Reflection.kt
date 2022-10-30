package app
//
//import annotations._81NotBlank
//import data.CreateCategoryRequest
//import data.CreateProductRequest
//import exception._69ValidationException
//import kotlin.reflect.full.findAnnotation
//import kotlin.reflect.full.memberProperties
//
//fun validateRequest(request: Any) {
//    val clazz = request::class
//    val properties = clazz.membersProperties
//
//    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
//    for (property in properties) {
//        if (property.findAnnotation<_81NotBlank>() != null) {
//            val value = property.call(request)
//            when (value) {
//                is String -> {
//                    if ("" == value) {
//                        throw _69ValidationException("${property.name} is blank")
//                    }
//                }
//            }
//        }
//    }
//}
//
//fun main() {
//    val request = CreateProductRequest("1", "Indomie", 2000)
//    validateRequest(request)
//
//    val request2 = CreateCategoryRequest("F", "")
//    validateRequest(request2)
//}