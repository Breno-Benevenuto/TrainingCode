package com.example.TrainingCode.TrainingCode.tasks;

import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;
import com.example.TrainingCode.TrainingCode.tasks.auxiliar.ListNode;

public class mergeTwoSortedLists implements taskInterface {
    @Override
    public void Run() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        printList(mergeTwoLists(list1,list2));

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var response = mergeTwoListsRec(list1,list2, new ListNode());
        return response.next;
    }

    private ListNode mergeTwoListsRec(ListNode list1, ListNode list2, ListNode response){
        if(list1 == null && list2 != null){
            adicionarNoFinal(response,list2.val);
            return mergeTwoListsRec(null, list2.next, response);
        }

        if(list2 == null && list1 != null){
            adicionarNoFinal(response,list1.val);
            return mergeTwoListsRec(list1.next, null, response);
        }

        if(list2 == null && list1 == null){
            return response;
        }

        if(list1.val >= list2.val){
            adicionarNoFinal(response,list2.val);
            return mergeTwoListsRec(list1, list2.next, response);
        }else{
            adicionarNoFinal(response,list1.val);
            return mergeTwoListsRec(list1.next, list2, response);
        }
    }

    public static void adicionarNoFinal(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = head;

        // Percorre a lista até encontrar o último nó
        while (current.next != null) {
            current = current.next;
        }

        // Define o próximo do último nó como o novo nó
        current.next = newNode;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }
}
