import java.util.Objects.hash

open class Rectangle(val width: Int, val height: Int) : Figure {
    override fun area(): Int = width * height

    override fun toString(): String {
        return "Rectangle(${width}x${height})"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (this.javaClass != other?.javaClass) return false

        other as Rectangle

        return width==other.width && height==other.height
    }

    override fun hashCode(): Int {
        return hash(width,height)
    }
}