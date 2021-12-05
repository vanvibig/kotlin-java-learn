package visitor

import visitor.dto.Bar
import visitor.dto.Baz
import visitor.dto.Foo

fun main() {
    val elements = listOf(Foo(), Bar(), Baz())

    val upVisitor = UpVisitor()
    val downVisitor = DownVisitor()

    for (e in elements) {
        e.accept(upVisitor)
        e.accept(downVisitor)
    }
}