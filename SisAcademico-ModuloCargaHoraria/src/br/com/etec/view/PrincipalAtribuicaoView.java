/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.view;

import br.com.etec.cargahoraria.dao.AtribuicaoDao;
import br.com.etec.cargahoraria.dao.DisciplinaDao;
import br.com.etec.cargahoraria.dao.PeriodoLetivoDao;
import br.com.etec.exception.EtecAbException;
import br.com.etec.model.Atribuicao;
import br.com.etec.model.Disciplina;
import br.com.etec.model.PeriodoLetivo;
import br.com.etec.model.Turma;
import br.com.etec.util.Operacao;
import br.com.etec.util.TipoAtribuicaoBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author dfelix3
 */
public class PrincipalAtribuicaoView extends javax.swing.JFrame {

    /**
     * Método construtor da classe PrincipalAtribuicaoView
     */
    private DisciplinaDao disDao = new DisciplinaDao();
    private AtribuicaoDao atrDao = new AtribuicaoDao();
    private Operacao operacao = Operacao.NENHUM;

    public PrincipalAtribuicaoView(List<PeriodoLetivo> periodosLetivos) {
        initPeriodosLetivos(periodosLetivos);
        initComponents();
    }

    /**
     * Este método é invocado pelo construtor e seu objetivo é inicializar o
     * form. WARNING: Não modifique este código. O seu conteúdo é
     * automaticamente regerado pelo editor visual do formulário.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listPeriodoLetivo = listPeriodoLetivo;
        periodoLetivo = new br.com.etec.model.PeriodoLetivo();
        turma = new br.com.etec.model.Turma();
        listAtribuicao = ObservableCollections.observableList(new ArrayList<Atribuicao>());
        paneltitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSelecionePeriodo = new javax.swing.JLabel();
        cboPeriodoLetivo = new javax.swing.JComboBox();
        lblSelecionePeriodo1 = new javax.swing.JLabel();
        cboTurma = new javax.swing.JComboBox();
        btnIniciarAtribuicao = new javax.swing.JButton();
        panelDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAtribuicao = new javax.swing.JTable();
        btnIniciarAtribuicao1 = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cboPeriodoLetivo, org.jdesktop.beansbinding.ELProperty.create("${selectedItem}"), turma, org.jdesktop.beansbinding.BeanProperty.create("periodoLetivo"));
        bindingGroup.addBinding(binding);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cboPeriodoLetivo, org.jdesktop.beansbinding.ELProperty.create("${selectedItem.toString}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"), "titleBinding");
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Atribuição de Aulas");

        lblSelecionePeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSelecionePeriodo.setText("Selecione o período letivo:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listPeriodoLetivo, cboPeriodoLetivo);
        bindingGroup.addBinding(jComboBoxBinding);

        lblSelecionePeriodo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSelecionePeriodo1.setText("Selecione a turma:");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedItem.turmaList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cboPeriodoLetivo, eLProperty, cboTurma);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, turma, org.jdesktop.beansbinding.ObjectProperty.create(), cboTurma, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        btnIniciarAtribuicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniciarAtribuicao.setText("Iniciar Atribuição!");
        btnIniciarAtribuicao.setActionCommand("iniciarAtribuicao");
        btnIniciarAtribuicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarAtribuicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneltituloLayout = new javax.swing.GroupLayout(paneltitulo);
        paneltitulo.setLayout(paneltituloLayout);
        paneltituloLayout.setHorizontalGroup(
            paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltituloLayout.createSequentialGroup()
                .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltituloLayout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(lblTitulo))
                    .addGroup(paneltituloLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltituloLayout.createSequentialGroup()
                                    .addComponent(lblSelecionePeriodo1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paneltituloLayout.createSequentialGroup()
                                    .addComponent(lblSelecionePeriodo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboPeriodoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paneltituloLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(btnIniciarAtribuicao)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        paneltituloLayout.setVerticalGroup(
            paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(11, 11, 11)
                .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecionePeriodo)
                    .addComponent(cboPeriodoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecionePeriodo1)
                    .addComponent(cboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIniciarAtribuicao)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(paneltitulo);

        tableAtribuicao.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tableAtribuicao.setColumnSelectionAllowed(true);
        tableAtribuicao.setIntercellSpacing(new java.awt.Dimension(2, 4));
        tableAtribuicao.setMaximumSize(new java.awt.Dimension(815, 0));
        tableAtribuicao.setMinimumSize(new java.awt.Dimension(815, 0));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listAtribuicao, tableAtribuicao);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${disciplina}"));
        columnBinding.setColumnName("Componente");
        columnBinding.setColumnClass(br.com.etec.model.Disciplina.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cargaHorariaAtribuida}"));
        columnBinding.setColumnName("C.H.");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoAtribuicao}"));
        columnBinding.setColumnName("Atribuição");
        columnBinding.setColumnClass(br.com.etec.model.TipoAtribuicao.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${professor}"));
        columnBinding.setColumnName("Professor");
        columnBinding.setColumnClass(br.com.etec.model.Professor.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hasSubstituicao}"));
        columnBinding.setColumnName("Substitução?");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${atribuicaoSubstituicao.professor}"));
        columnBinding.setColumnName("Substituto");
        columnBinding.setColumnClass(br.com.etec.model.Professor.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tableAtribuicao);
        tableAtribuicao.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAtribuicao.getColumnModel().getColumn(0).setMinWidth(250);
        tableAtribuicao.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableAtribuicao.getColumnModel().getColumn(1).setResizable(false);
        tableAtribuicao.getColumnModel().getColumn(1).setPreferredWidth(10);
        tableAtribuicao.getColumnModel().getColumn(2).setResizable(false);
        tableAtribuicao.getColumnModel().getColumn(2).setPreferredWidth(50);
        tableAtribuicao.getColumnModel().getColumn(3).setMinWidth(225);
        tableAtribuicao.getColumnModel().getColumn(3).setPreferredWidth(225);
        tableAtribuicao.getColumnModel().getColumn(3).setCellEditor(new br.com.etec.util.view.ProfessorCellEditor());
        tableAtribuicao.getColumnModel().getColumn(4).setResizable(false);
        tableAtribuicao.getColumnModel().getColumn(4).setPreferredWidth(55);
        tableAtribuicao.getColumnModel().getColumn(5).setMinWidth(225);
        tableAtribuicao.getColumnModel().getColumn(5).setPreferredWidth(225);
        tableAtribuicao.getColumnModel().getColumn(5).setCellEditor(new br.com.etec.util.view.ProfessorCellEditor());

        btnIniciarAtribuicao1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniciarAtribuicao1.setText("Encerrar Atribuição");
        btnIniciarAtribuicao1.setActionCommand("iniciarAtribuicao");
        btnIniciarAtribuicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarAtribuicao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarAtribuicao1)
                .addGap(343, 343, 343))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarAtribuicao1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(panelDados);

        bindingGroup.bind();

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-676)/2, 1016, 676);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarAtribuicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarAtribuicaoActionPerformed
        try {
            this.turma = ((Turma) cboTurma.getSelectedItem());
            this.periodoLetivo = ((PeriodoLetivo) cboPeriodoLetivo.getSelectedItem());

            List<Atribuicao> listExistente = atrDao.listAllByTurmaPeriodoLetivo(turma, periodoLetivo);

            this.listAtribuicao.clear();

            //Se o par turma / período letivo possui uma atribuição válida.
            if (listExistente != null && listExistente.size() > 0) {
                this.listAtribuicao.addAll(this.alinharAtribuicao(listExistente));
                this.operacao = Operacao.ALTERAR;
            } else {
                List<Disciplina> disciplinas = disDao.obterDisciplinasPorModulo(turma.getModulo());

                if (disciplinas == null || disciplinas.size() <= 0) {
                    throw new EtecAbException("Não existem componentes associados. Tente novamente!");
                }

                for (Disciplina d : disciplinas) {
                    criarAtribuicoesPorDisciplina(d);
                }
                this.operacao = Operacao.INCLUIR;
            }



            habilitarInicioAtribuicao(false);
        } catch (EtecAbException ex) {
            Logger.getLogger(PrincipalAtribuicaoView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarAtribuicaoActionPerformed

    private void btnIniciarAtribuicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarAtribuicao1ActionPerformed
        try {
            validarAtribuicao();
            if (operacao == Operacao.INCLUIR) {
                atrDao.createAll(listAtribuicao);
            } else {
                atrDao.updateAll(listAtribuicao);
            }
        } catch (EtecAbException ex) {
            Logger.getLogger(PrincipalAtribuicaoView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarAtribuicao1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAtribuicaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalAtribuicaoView(new PeriodoLetivoDao().listAllActive()).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarAtribuicao;
    private javax.swing.JButton btnIniciarAtribuicao1;
    private javax.swing.JComboBox cboPeriodoLetivo;
    private javax.swing.JComboBox cboTurma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionePeriodo;
    private javax.swing.JLabel lblSelecionePeriodo1;
    private javax.swing.JLabel lblTitulo;
    private java.util.List<Atribuicao> listAtribuicao;
    private java.util.List<PeriodoLetivo> listPeriodoLetivo;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel paneltitulo;
    private br.com.etec.model.PeriodoLetivo periodoLetivo;
    private javax.swing.JTable tableAtribuicao;
    private br.com.etec.model.Turma turma;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void initPeriodosLetivos(List<PeriodoLetivo> periodosLetivos) {
        if (periodosLetivos == null || periodosLetivos.size() <= 0) {
            throw new NullPointerException("Não há períodos letivos vigentes. Impossível iniciar atribuição");
        }
        this.listPeriodoLetivo = ObservableCollections.observableList(periodosLetivos);
    }

    private void habilitarInicioAtribuicao(Boolean flag) {
        this.paneltitulo.setEnabled(flag);
        this.btnIniciarAtribuicao.setEnabled(flag);
        this.cboPeriodoLetivo.setEnabled(flag);
        this.cboTurma.setEnabled(flag);
    }

    private void validarAtribuicao() throws EtecAbException {
        String errors = "";
        int quantidade = 0;
        for (Atribuicao atr : listAtribuicao) {
            if (atr.getProfessor() == null) {
                errors += "\n\t- " + "O componente \"" + atr.getDisciplina() + "\" (" + atr.getTipoAtribuicao().getNome() + ") não possui professor atribuído";
                quantidade++;
            }
            if (atr.hasSubstituicao() && atr.getAtribuicaoSubstituicao().getProfessor() == null) {
                errors += "\n\t- " + "O componente \"" + atr.getDisciplina() + "\" (" + atr.getTipoAtribuicao().getNome() + ") foi sinalizado como SUBSTITUIÇÃO e não possui professor substituto atribuído";
                quantidade++;
            }
            if (atr.getProfessor() != null && atr.getProfessor().getMatricula() == 0 && atr.hasSubstituicao()) {
                errors += "\n\t- " + "O componente \"" + atr.getDisciplina() + "\" (" + atr.getTipoAtribuicao().getNome() + ") foi sinalizado como sem professor e possui substituição de aula";
                quantidade++;
            }
        }
        if (quantidade > 0) {
            String numeroS = quantidade > 1 ? "s" : "";
            throw new EtecAbException("Erro" + numeroS + " ao salvar a atribuição:\n" + errors);
        }
    }

    private void criarAtribuicoesPorDisciplina(final Disciplina d) throws EtecAbException {
        criarAtribuicaoTitular(d);
        if (d.hasDivisao()) {
            criarAtribuicaoDivisao(d);
        }
    }

    private void criarAtribuicaoDivisao(final Disciplina d) throws EtecAbException {
        Atribuicao atrDiv = new Atribuicao();
        atrDiv.setDisciplina(d);
        atrDiv.setPeriodoLetivo(periodoLetivo);
        atrDiv.setTurma(turma);
        atrDiv.setTipoAtribuicao(TipoAtribuicaoBuilder.getTipoAtribuicaoDivisao());
        atrDiv.setHasSubstituicao(Boolean.FALSE);
        atrDiv.setCargaHorariaAtribuida(d.getCargaHorariaDivisao());
        this.listAtribuicao.add(atrDiv);
    }

    private void criarAtribuicaoTitular(Disciplina d) throws EtecAbException {
        Atribuicao atr = new Atribuicao();
        atr.setDisciplina(d);
        atr.setPeriodoLetivo(periodoLetivo);
        atr.setTurma(turma);
        atr.setTipoAtribuicao(TipoAtribuicaoBuilder.getTipoAtribuicaoPrincipal());
        atr.setHasSubstituicao(Boolean.FALSE);
        atr.setCargaHorariaAtribuida(d.getCargaHoraria());
        this.listAtribuicao.add(atr);
    }

    private List<Atribuicao> alinharAtribuicao(List<Atribuicao> listExistente) {
        List<Atribuicao> listAux = new ArrayList<>();
        listAux.addAll(listExistente);
        for(Atribuicao atribuicao: listExistente){
            for(Atribuicao atribuicao1: listExistente){
                if (atribuicao1.hasSubstituicao() == null || !atribuicao1.hasSubstituicao()) {
                    continue;
                }
                if (atribuicao.equals(atribuicao1.getAtribuicaoSubstituicao())) {
                    listAux.remove(atribuicao);
                }
            }
        }
        return listAux;
    }
}
