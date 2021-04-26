/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristi.lab9_pa;

import java.awt.Color;

/**
 *
 * @author crist
 */
public class Bar
    {
        private String label;
        private float value;
        private Color color;

        public Bar(String label, float value, Color color)
        {
            this.label = label;
            this.value = value;
            this.color = color;
        }

        public String getLabel()
        {
            return label;
        }

        public float getValue()
        {
            return value;
        }

        public Color getColor()
        {
            return color;
        }
    }
