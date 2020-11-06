package SingleTune;

import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;
import mainFrame.Equalizer;



public class Tune {
    
    
    
    /// default value of tune
    /// these default value are given in jmusic library
    static double duration = 0.9;
    static int dynamic = 127;
    double rythm = 1.0;
    int maxDynamic = 127;

    
    /// getter and setter to set the value
    public double getDuration() {
        return duration;
    }

    public static int getDynamic() {
        return dynamic;
    }

    public double getRythm() {
        return rythm;
    }

    public double getPan() {
        return pan;
    }
    double pan = 0.5;

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public static void setDynamic(int dynamic) {
        Tune.dynamic = dynamic;
    }

    public void setRythm(double rythm) {
        this.rythm = rythm;
    }

    public void setPan(double pan) {
        this.pan = pan;
    }
    
    
    

    
    /// Function to generate sound
    /// tf_1_C2()...
    /// here tf stands for tune function.
    /// 1 stands for this function will call by pressing key "1".
    /// and C2 is the tune name.
    
    public void tf_1_C2() {
        
        /*
        Creating object of Node class
        Node class have all the property
        to generate a sound.
         */
        Note C2 = new Note(); 
       
        C2.setPitch(JMC.C2); // setting the pitch for specific Tune.
        C2.setDuration(duration); // how long the tune will play.
        C2.setDynamic(dynamic); // volume is cntrolled by dynamic
        Play.midi(C2); // after setting property, play the tune.
        System.out.println(duration);
        System.out.println(dynamic);
    }

    public void tf_8_C3() {
        Note C3 = new Note();
        C3.setPitch(JMC.C3);
        C3.setDuration(duration);
        C3.setDynamic(dynamic);
        Play.midi(C3);

    }
    public void tf_t_C4() {
        Note C4 = new Note();
        C4.setPitch(JMC.C4);
        C4.setDuration(duration);
        C4.setDynamic(dynamic);
        Play.midi(C4);
    }
    public void tf_s_C5() {
        Note C5 = new Note();
        C5.setPitch(JMC.C5);
        C5.setDuration(duration);
        C5.setDynamic(dynamic);
        Play.midi(C5);
    }
    public void tf_l_C6() {
        Note C6 = new Note();
        C6.setPitch(JMC.C6);
        C6.setDuration(4);
        C6.setDynamic(dynamic);
        Play.midi(C6);
    }
    public void tf_m_C7() {
        Note C7 = new Note();
        C7.setPitch(JMC.C7);
        C7.setDuration(duration);
        C7.setDynamic(dynamic);
        Play.midi(C7);
    }
    public void tf_2_D2() {
        Note D2 = new Note();
        D2.setPitch(JMC.D2);
        D2.setDuration(duration);
        D2.setDynamic(dynamic);
        Play.midi(D2);
    }
    public void tf_9_D3() {
        Note D3 = new Note();
        D3.setPitch(JMC.D3);
        D3.setDuration(duration);
        D3.setDynamic(dynamic);
        Play.midi(D3);
    }
    public void tf_y_D4() {
        Note D4 = new Note();
        D4.setPitch(JMC.D4);
        D4.setDuration(duration);
        D4.setDynamic(dynamic);
        Play.midi(D4);
    }
    public void tf_d_D5() {
        Note D5 = new Note();
        D5.setPitch(JMC.D5);
        D5.setDuration(duration);
        D5.setDynamic(dynamic);
        Play.midi(D5);
    }
    public void tf_z_D6() {
        Note D6 = new Note();
        D6.setPitch(JMC.D6);
        D6.setDuration(duration);
        D6.setDynamic(dynamic);
        Play.midi(D6);
    }
    public void tf_3_E2() {
        Note E2 = new Note();
        E2.setPitch(JMC.E2);
        E2.setDuration(duration);
        E2.setDynamic(dynamic);
        Play.midi(E2);
    }
    public void tf_0_E3() {
        Note E3 = new Note();
        E3.setPitch(JMC.E3);
        E3.setDuration(duration);
        E3.setDynamic(dynamic);
        Play.midi(E3);
    }
    public void tf_u_E4() {
        Note E4 = new Note();
        E4.setPitch(JMC.E4);
        E4.setDuration(duration);
        E4.setDynamic(dynamic);
        Play.midi(E4);
    }
    public void tf_f_E5() {
        Note E5 = new Note();
        E5.setPitch(JMC.E5);
        E5.setDuration(duration);
        E5.setDynamic(dynamic);
        Play.midi(E5);
    }
    public void tf_x_E6() {
        Note E6 = new Note();
        E6.setPitch(JMC.E6);
        E6.setDuration(duration);
        E6.setDynamic(dynamic);
        Play.midi(E6);
    }
    public void tf_4_F2() {
        Note F2 = new Note();
        F2.setPitch(JMC.F2);
        F2.setDuration(duration);
        F2.setDynamic(dynamic);
        Play.midi(F2);
    }
    public void tf_q_F3() {
        Note F3 = new Note();
        F3.setPitch(JMC.F3);
        F3.setDuration(duration);
        F3.setDynamic(dynamic);
        Play.midi(F3);
    }
    public void tf_i_F4() {
        Note F4 = new Note();
        F4.setPitch(JMC.F4);
        F4.setDuration(duration);
        F4.setDynamic(dynamic);
        Play.midi(F4);
    }
    public void tf_g_F5() {
        Note F5 = new Note();
        F5.setPitch(JMC.F5);
        F5.setDuration(duration);
        F5.setDynamic(dynamic);
        Play.midi(F5);
    }
    public void tf_c_F6() {
        Note F6 = new Note();
        F6.setPitch(JMC.F6);
        F6.setDuration(duration);
        F6.setDynamic(dynamic);
        Play.midi(F6);
    }
    public void tf_5_G2() {
        Note G2 = new Note();
        G2.setPitch(JMC.G2);
        G2.setDuration(duration);
        G2.setDynamic(dynamic);
        Play.midi(G2);
    }
    public void tf_w_G3() {
        Note G3 = new Note();
        G3.setPitch(JMC.G3);
        G3.setDuration(duration);
        G3.setDynamic(dynamic);
        Play.midi(G3);
    }
    public void tf_o_G4() {
        Note G4 = new Note();
        G4.setPitch(JMC.G4);
        G4.setDuration(duration);
        G4.setDynamic(dynamic);
        Play.midi(G4);
    }
    public void tf_h_G5() {
        Note G5 = new Note();
        G5.setPitch(JMC.G5);
        G5.setDuration(duration);
        G5.setDynamic(dynamic);
        Play.midi(G5);
    }
    public void tf_v_G6() {
        Note G6 = new Note();
        G6.setPitch(JMC.G6);
        G6.setDuration(duration);
        G6.setDynamic(dynamic);
        Play.midi(G6);
    }
    public void tf_6_A2() {
        Note A2 = new Note();
        A2.setPitch(JMC.A2);
        A2.setDuration(duration);
        A2.setDynamic(dynamic);
        Play.midi(A2);
    }
    public void tf_e_A3() {
        Note A3 = new Note();
        A3.setPitch(JMC.A3);
        A3.setDuration(duration);
        A3.setDynamic(dynamic);
        Play.midi(A3);
    }
    public void tf_p_A4() {
        Note A4 = new Note();
        A4.setPitch(JMC.A4);
        A4.setDuration(duration);
        A4.setDynamic(dynamic);
        Play.midi(A4);
    }
    public void tf_j_A5() {
        Note A5 = new Note();
        A5.setPitch(JMC.A5);
        A5.setDuration(duration);
        A5.setDynamic(dynamic);
        Play.midi(A5);
    }
    public void tf_b_A6() {
        Note A6 = new Note();
        A6.setPitch(JMC.A6);
        A6.setDuration(4);
        A6.setDynamic(dynamic);
        Play.midi(A6);
    }
    public void tf_7_B2() {
        Note B2 = new Note();
        B2.setPitch(JMC.B2);
        B2.setDuration(duration);
        B2.setDynamic(dynamic);
        Play.midi(B2);
    }
    public void tf_r_B3() {
        Note B3 = new Note();
        B3.setPitch(JMC.B3);
        B3.setDuration(duration);
        B3.setDynamic(dynamic);
        Play.midi(B3);
    }
    public void tf_a_B4() {
        Note B4 = new Note();
        B4.setPitch(JMC.B4);
        B4.setDuration(duration);
        B4.setDynamic(dynamic);
        Play.midi(B4);
    }
    public void tf_k_B5() {
        Note B5 = new Note();
        B5.setPitch(JMC.B5);
        B5.setDuration(duration);
        B5.setDynamic(dynamic);
        Play.midi(B5);
    }
    public void tf_n_B6() {
        Note B6 = new Note();
        B6.setPitch(JMC.B6);
        B6.setDuration(duration);
        B6.setDynamic(dynamic);
        Play.midi(B6);
    }
    public void tf_1s_C2s() {
        Note C2s = new Note();
        C2s.setPitch(JMC.CS2);
        C2s.setDuration(duration);
        C2s.setDynamic(dynamic);
        Play.midi(C2s);
    }

    public void tf_8s_C3s() {
        Note C3s = new Note();
        C3s.setPitch(JMC.CS3);
        C3s.setDuration(duration);
        C3s.setDynamic(dynamic);
        Play.midi(C3s);

    }
    public void tf_ts_C4s() {
        Note C4s = new Note();
        C4s.setPitch(JMC.CS4);
        C4s.setDuration(duration);
        C4s.setDynamic(dynamic);
        Play.midi(C4s);
    }
    public void tf_ss_C5s() {
        Note C5s = new Note();
        C5s.setPitch(JMC.CS5);
        C5s.setDuration(duration);
        C5s.setDynamic(dynamic);
        Play.midi(C5s);
    }
    public void tf_ls_C6s() {
        Note C6s = new Note();
        C6s.setPitch(JMC.CS6);
        C6s.setDuration(duration);
        C6s.setDynamic(dynamic);
        Play.midi(C6s);
    }
    public void tf_2s_D2s() {
        Note D2s = new Note();
        D2s.setPitch(JMC.DS2);
        D2s.setDuration(duration);
        D2s.setDynamic(dynamic);
        Play.midi(D2s);
    }
    public void tf_9s_D3s() {
        Note D3s = new Note();
        D3s.setPitch(JMC.DS3);
        D3s.setDuration(duration);
        D3s.setDynamic(dynamic);
        Play.midi(D3s);
    }
    public void tf_ys_D4s() {
        Note D4s = new Note();
        D4s.setPitch(JMC.DS4);
        D4s.setDuration(duration);
        D4s.setDynamic(dynamic);
        Play.midi(D4s);
    }
    public void tf_ds_D5s() {
        Note D5s = new Note();
        D5s.setPitch(JMC.DS5);
        D5s.setDuration(duration);
        D5s.setDynamic(dynamic);
        Play.midi(D5s);
    }
    public void tf_zs_D6s() {
        Note D6s = new Note();
        D6s.setPitch(JMC.DS6);
        D6s.setDuration(duration);
        D6s.setDynamic(dynamic);
        Play.midi(D6s);
    }
    public void tf_4s_F2s() {
        Note F2s = new Note();
        F2s.setPitch(JMC.FS2);
        F2s.setDuration(duration);
        F2s.setDynamic(dynamic);
        Play.midi(F2s);
    }
    public void tf_qs_F3s() {
        Note F3s = new Note();
        F3s.setPitch(JMC.FS3);
        F3s.setDuration(duration);
        F3s.setDynamic(dynamic);
        Play.midi(F3s);
    }
    public void tf_is_F4s() {
        Note F4s = new Note();
        F4s.setPitch(JMC.FS4);
        F4s.setDuration(duration);
        F4s.setDynamic(dynamic);
        Play.midi(F4s);
    }
    public void tf_gs_F5s() {
        Note F5s = new Note();
        F5s.setPitch(JMC.FS5);
        F5s.setDuration(duration);
        F5s.setDynamic(dynamic);
        Play.midi(F5s);
    }
    public void tf_cs_F6s() {
        Note F6s = new Note();
        F6s.setPitch(JMC.FS6);
        F6s.setDuration(duration);
        F6s.setDynamic(dynamic);
        Play.midi(F6s);
    }
    public void tf_5s_G2s() {
        Note G2s = new Note();
        G2s.setPitch(JMC.GS2);
        G2s.setDuration(duration);
        G2s.setDynamic(dynamic);
        Play.midi(G2s);
    }
    public void tf_ws_G3s() {
        Note G3s = new Note();
        G3s.setPitch(JMC.GS3);
        G3s.setDuration(duration);
        G3s.setDynamic(dynamic);
        Play.midi(G3s);
    }
    public void tf_os_G4s() {
        Note G4s = new Note();
        G4s.setPitch(JMC.GS4);
        G4s.setDuration(duration);
        G4s.setDynamic(dynamic);
        Play.midi(G4s);
    }
    public void tf_hs_G5s() {
        Note G5s = new Note();
        G5s.setPitch(JMC.GS5);
        G5s.setDuration(duration);
        G5s.setDynamic(dynamic);
        Play.midi(G5s);
    }
    public void tf_vs_G6s() {
        Note G6s = new Note();
        G6s.setPitch(JMC.GS6);
        G6s.setDuration(duration);
        G6s.setDynamic(dynamic);
        Play.midi(G6s);
    }
    public void tf_6s_A2s() {
        Note A2s = new Note();
        A2s.setPitch(JMC.AS2);
        A2s.setDuration(duration);
        A2s.setDynamic(dynamic);
        Play.midi(A2s);
    }
    public void tf_es_A3s() {
        Note A3s = new Note();
        A3s.setPitch(JMC.AS3);
        A3s.setDuration(duration);
        A3s.setDynamic(dynamic);
        Play.midi(A3s);
    }
    public void tf_ps_A4s() {
        Note A4s = new Note();
        A4s.setPitch(JMC.AS4);
        A4s.setDuration(duration);
        A4s.setDynamic(dynamic);
        Play.midi(A4s);
    }
    public void tf_js_A5s() {
        Note A5s = new Note();
        A5s.setPitch(JMC.AS5);
        A5s.setDuration(duration);
        A5s.setDynamic(dynamic);
        Play.midi(A5s);
    }
    public void tf_bs_A6s() {
        Note A6s = new Note();
        A6s.setPitch(JMC.AS6);
        A6s.setDuration(duration);
        A6s.setDynamic(dynamic);
        Play.midi(A6s);
    }
}
