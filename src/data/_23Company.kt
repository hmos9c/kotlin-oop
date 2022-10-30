package data

class _23Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is _23Company -> other.name == this.name
            else -> false
        }
    }

}