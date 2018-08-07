/**
 * 輸入兩個正整數鏈結，位數反向儲存，最前面為個位數,每個節點代表一個位置,將兩個節點相加後回傳
 * 例：
 * 	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 個位數為2與5，相加為7 ； 十位數為4+6 = 10，需要進位 ； 百位數為3 + 4 + 1(進位) = 8，結果為 7->0->8
 * @author black
 *
 */
public class AddTwoNumbers
{
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        l1.next = x2;
        x2.next = x3;
         
        ListNode l2 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4);
        l2.next = y2;
        y2.next = y3;
        ListNode ret = Solution.addTwoNumbers(l1, l2);
        while(ret!=null)
        {
        	System.out.println(ret.val);
        	ret=ret.next;
        }
        
	}
}