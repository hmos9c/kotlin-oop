package data

import annotations._81NotBlank

data class CreateProductRequest(
    @_81NotBlank val id: String,
    @_81NotBlank val name: String,
    @_81NotBlank val price: Long
)

data class CreateCategoryRequest(
    @_81NotBlank val id: String,
    @_81NotBlank val name: String
)