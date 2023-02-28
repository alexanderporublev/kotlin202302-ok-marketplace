import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertContains
import kotlin.math.sin
import kotlin.math.PI
class StubTest {

    @Test
    fun test(){
        assertEquals(4, 2*2)
        assertEquals(0.5, sin(PI / 6), 1e-5)
        assertContains(arrayOf(1, 2, 3), 2)
        assertContains(IntRange(2, 6), 4)
        assertContains("9999", "9")
        assertContains("123456", Regex("""^\d+$"""))
    }
}