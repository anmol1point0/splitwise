package com.example.splitwise.DTO;

import java.util.List;

import com.example.splitwise.models.Transaction;
import com.example.splitwise.models.UserProfile;

public class TransactionRequest {
    // which user
	//        users involved.
	//        total expense
	//        which method
	//        paid by?
	//        expense 
    private UserProfile userProfile;
    private List<UserProfile> participants;
    private String method;
    private double totalExpense;
    private UserProfile paidByUser;
    private List<Transaction> transactions;

}
