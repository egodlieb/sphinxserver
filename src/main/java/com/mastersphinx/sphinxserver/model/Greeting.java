/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastersphinx.sphinxserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Linus
 */

@AllArgsConstructor
public class Greeting {
    
    
    @Getter
    @Setter
    private int idNumber;
    
    
    @Getter
    @Setter
    private String greeting;
    
    
   
}
