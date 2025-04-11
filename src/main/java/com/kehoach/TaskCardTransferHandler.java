///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.kehoach;
//
//import java.awt.datatransfer.Transferable;
//import javax.swing.JComponent;
//import javax.swing.TransferHandler;
//
///**
// *
// * @author PC
// */
//public class TaskCardTransferHandler extends TransferHandler {
//    @Override
//    protected Transferable createTransferable(JComponent c) {
//        return new TaskCardTransferable((TaskCard) c);
//    }
//
//    @Override
//    public int getSourceActions(JComponent c) {
//        return MOVE;
//    }
//
//    @Override
//    public boolean canImport(TransferSupport support) {
//        return support.isDataFlavorSupported(TaskCard.TASK_FLAVOR);
//    }
//
//    @Override
//    public boolean importData(TransferSupport support) {
//        try {
//            TaskCard card = (TaskCard) support.getTransferable().getTransferData(TaskCard.TASK_FLAVOR);
//            // Thêm card vào panel đích
//            JComponent target = (JComponent) support.getComponent();
//            target.add(card);
//            target.revalidate();
//            target.repaint();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//}
