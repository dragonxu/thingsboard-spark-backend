/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pgr.spark;


/**
 *
 * @author cristian
 */
public interface Action {
    public void execute();
    public String getIdParcel();
    public void setIdParcel(String idParcel);
}