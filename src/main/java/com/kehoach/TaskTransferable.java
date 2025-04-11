///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.kehoach;
//
///**
// *
// * @author PC
// */
//// TaskTransferable.java
//
//import java.awt.datatransfer.*;
//
//public class TaskTransferable implements Transferable {
//    private final TaskCard taskCard;
//
//    public TaskTransferable(TaskCard taskCard) {
//        this.taskCard = taskCard;
//    }
//
//    public static final DataFlavor TASK_FLAVOR = new DataFlavor(TaskCard.class, "TaskCard");
//
//    @Override
//    public DataFlavor[] getTransferDataFlavors() {
//        return new DataFlavor[]{TASK_FLAVOR};
//    }
//
//    @Override
//    public boolean isDataFlavorSupported(DataFlavor flavor) {
//        return TASK_FLAVOR.equals(flavor);
//    }
//
//    @Override
//    public Object getTransferData(DataFlavor flavor) {
//        if (TASK_FLAVOR.equals(flavor)) {
//            return taskCard;
//        }
//        return null;
//    }
//}
//
