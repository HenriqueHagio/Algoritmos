public class MergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

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

    public static void main(String[] args) {
        MergeTwoLists instance = new MergeTwoLists();

        // Criar a primeira lista: 1 -> 2 -> 4
        ListNode list1 = instance.new ListNode(1);
        list1.next = instance.new ListNode(2);
        list1.next.next = instance.new ListNode(4);

        // Criar a segunda lista: 1 -> 3 -> 4
        ListNode list2 = instance.new ListNode(1);
        list2.next = instance.new ListNode(3);
        list2.next.next = instance.new ListNode(4);

        // Juntar as duas listas
        ListNode mergedList = instance.mergeTwoLists(list1, list2);

        // Imprimir a lista mesclada
        instance.printList(mergedList);
    }

    // Método para imprimir a lista
    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
