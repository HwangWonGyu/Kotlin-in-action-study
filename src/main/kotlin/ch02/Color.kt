package ch02

enum class Color (
    val r: Int, val g: Int, val b: Int // 상수의 프로퍼티를 정의
) {
    RED (255, 0, 0), ORANGE(255, 165, 0), // 각 상수를 생성할 때 그에 대한 프로퍼티 값을 지정한다.
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);
    // 여기 반드시 세미콜론 사용해야 한다.
    // enum 상수 목록과 메서드 정의 사이에 사용한다.

    fun rgb() = (r * 256 + g) * 256 + b // enum 클래스 안에서 메서드 정의
}