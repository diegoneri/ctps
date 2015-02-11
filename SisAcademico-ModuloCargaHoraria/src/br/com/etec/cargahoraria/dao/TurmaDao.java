/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.cargahoraria.dao;

import br.com.etec.model.Turma;

/**
 *
 * @author dfelix3
 */
public class TurmaDao extends GenericDao<Turma, Integer> {

    public TurmaDao() {
        super(Turma.class);
    }

    @Override
    protected String getSortField() {
        return "";
    }
}
