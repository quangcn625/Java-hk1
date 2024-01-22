/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author WIN
 */
public class TenDoi {
    private static int cnt = 1;
    private String IDTeam;
    private String NameTeam;

    public TenDoi(String NameTeam) {
        this.IDTeam = "Team" + String.format("%02d",cnt++);
        this.NameTeam = NameTeam;
    }

    public String getIDTeam() {
        return IDTeam;
    }

    public String getNameTeam() {
        return NameTeam;
    }
    
}
