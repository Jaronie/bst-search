import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void BstSearchJUnitTest(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(30, new BinaryTreeNode<Integer>(10),new BinaryTreeNode<Integer>(15));
        
        boolean result = true;

        boolean expected = BstSearch.contains(root, 10);

        assertEquals(expected, result);
}

}