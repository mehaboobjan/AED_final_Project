/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class WorkRequestQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    
    public WorkRequestQueue(){
        workRequestList=new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    
}
