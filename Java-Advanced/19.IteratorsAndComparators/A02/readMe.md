Create a class Library from UML diagram below:
<<Iterable<Book>>>
Library
-books: Book[]
+iterator(): Iterator<Book>
Create a nested class LibIterator from UML diagram below:
<<Iterator<Book>>>
LibIterator
-counter: int
+hasNext(): boolean
+next(): Book
