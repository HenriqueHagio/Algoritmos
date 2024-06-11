    
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }

            
    }
    

     /**
     * 	
       21 Merge Two Sorted Lists
     */
    class Solution21{
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Criar um nó fictício que serve como ponto de partida
            ListNode dummy = new ListNode();
            // Usar um ponteiro para acompanhar a construção da nova lista
            ListNode current = dummy;
    
            // Enquanto as duas listas não estiverem vazias
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    // Adicionar o menor valor à nova lista
                    current.next = list1;
                    // Mover o ponteiro da lista de onde tiramos o nó
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                // Mover o ponteiro da nova lista
                current = current.next;
            }
            // Adicionar os nós restantes da lista que não terminou
            if (list1 != null)
                current.next = list1;
            else
                current.next = list2;
    
            // Retornar a nova lista unida, começando do nó seguinte ao nó fictício
            return dummy.next;
        }
    }
   
      /**
     * 1290	Convert Binary Number in a Linked List to Integer
     */
    class Solution1290 {
        public int getDecimalValue(ListNode head) {
            StringBuilder concatenatedString = new StringBuilder();
            while(head != null){
                concatenatedString.append(head.val);
                head = head.next;
            }
            return Integer.valueOf(concatenatedString.toString(), 2);
            
        }
    }
    /**
     * Solution876 Middle of the Linked List
     */
    class Solution876 {
        public ListNode middleNode(ListNode head) {
            if(head == null){
                return null;
            }
            ListNode rapido = head;
            ListNode lento = head;
           
            while (rapido != null && rapido.next != null) {
                lento = lento.next;
                rapido = rapido.next.next;

            }
            return lento;
        }


    }   
    

