<<<<<<< HEAD
package br.uem.din.bibliotec.config.model;

import java.util.Objects;

public class Emprestimo {
    //atributos persistentes no banco de dados
    private int codEmprestimo;
    private int codUsuario;
    private int codLivro;
    private String dataEmp;
    private String dataDev;
    private String dataAlt;
    private int ativo;

    //atributos auxiliares
    private String msgRetorno;
    private String colorMsgRetorno;
    private String nomeUsuario;
    private String emailUsuario;
    private String tituloLivro;
    private String autorLivro;
    private String editoraLivro;
    private String anoLancamentoLivro;
    private String statusEmprestimo;
    private String rgUsuario;
    private String cpfUsuario;
    private int empAtrasado;

    public Emprestimo (){}

    public Emprestimo(String dataEmp, String dataDev, String tituloLivro, String autorLivro, String editoraLivro, int empAtrasado) {
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.empAtrasado = empAtrasado;
    }

    public Emprestimo(int codUsuario, int codLivro, String dataEmp, String dataDev, String dataAlt, String nomeUsuario, String emailUsuario, String tituloLivro, String autorLivro, String editoraLivro, String anoLancamentoLivro, String statusEmprestimo) {
        this.codUsuario = codUsuario;
        this.codLivro = codLivro;
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.dataAlt = dataAlt;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.statusEmprestimo = statusEmprestimo;
    }

    public Emprestimo(int codEmprestimo, int codUsuario, int codLivro, String dataEmp, String dataDev, String dataAlt, String nomeUsuario, String emailUsuario, String tituloLivro, String autorLivro, String editoraLivro, String anoLancamentoLivro, String statusEmprestimo, String rgUsuario, String cpfUsuario) {
        this.codEmprestimo = codEmprestimo;
        this.codUsuario = codUsuario;
        this.codLivro = codLivro;
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
        this.dataAlt = dataAlt;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.statusEmprestimo = statusEmprestimo;
        this.rgUsuario = rgUsuario;
        this.cpfUsuario = cpfUsuario;
    }

    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(int codeEmprestimo) {
        this.codEmprestimo = codeEmprestimo;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(String dataEmp) {
        this.dataEmp = dataEmp;
    }

    public String getDataDev() {
        return dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    public String getDataAlt() {
        return dataAlt;
    }

    public void setDataAlt(String dataAlt) {
        this.dataAlt = dataAlt;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getMsgRetorno() {
        return msgRetorno;
    }

    public void setMsgRetorno(String msgRetorno) {
        this.msgRetorno = msgRetorno;
    }

    public String getColorMsgRetorno() {
        return colorMsgRetorno;
    }

    public void setColorMsgRetorno(String colorMsgRetorno) {
        this.colorMsgRetorno = colorMsgRetorno;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getAnolancamentoLivro() {
        return anoLancamentoLivro;
    }

    public void setAnolancamentoLivro(String anolancamentoLivro) {
        this.anoLancamentoLivro = anolancamentoLivro;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public String getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(String rgUsuario) {
        this.rgUsuario = rgUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public int getEmpAtrasado() { return empAtrasado; }

    public void setEmpAtrasado(int empAtrasado) { this.empAtrasado = empAtrasado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return codEmprestimo == that.codEmprestimo &&
                codUsuario == that.codUsuario &&
                codLivro == that.codLivro &&
                ativo == that.ativo &&
                Objects.equals(dataEmp, that.dataEmp) &&
                Objects.equals(dataDev, that.dataDev) &&
                Objects.equals(dataAlt, that.dataAlt) &&
                Objects.equals(msgRetorno, that.msgRetorno) &&
                Objects.equals(colorMsgRetorno, that.colorMsgRetorno) &&
                Objects.equals(nomeUsuario, that.nomeUsuario) &&
                Objects.equals(emailUsuario, that.emailUsuario) &&
                Objects.equals(tituloLivro, that.tituloLivro) &&
                Objects.equals(autorLivro, that.autorLivro) &&
                Objects.equals(editoraLivro, that.editoraLivro) &&
                Objects.equals(anoLancamentoLivro, that.anoLancamentoLivro) &&
                Objects.equals(statusEmprestimo, that.statusEmprestimo) &&
                Objects.equals(rgUsuario, that.rgUsuario) &&
                Objects.equals(cpfUsuario, that.cpfUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEmprestimo, codUsuario, codLivro, dataEmp, dataDev, dataAlt, ativo, msgRetorno, colorMsgRetorno, nomeUsuario, emailUsuario, tituloLivro, autorLivro, editoraLivro, anoLancamentoLivro, statusEmprestimo, rgUsuario, cpfUsuario);
    }
}
=======
package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.model.Emprestimo;
import br.uem.din.bibliotec.config.model.Livro;
import br.uem.din.bibliotec.config.model.Reserva;
import br.uem.din.bibliotec.config.model.Usuario;
import br.uem.din.bibliotec.config.services.Email;
import br.uem.din.bibliotec.config.services.FormataData;
import br.uem.din.bibliotec.config.services.FormataDocs;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDao {
    private Email email = new Email();
    private FormataData dtFormat = new FormataData();
    private FormataDocs docsFormat = new FormataDocs();

    public List<Usuario> consultaUsuariosEmp() throws SQLException {
        List<Usuario> usuarios_emp = new ArrayList<Usuario>();

        //realiza conexão com banco de dados
        Conexao con = new Conexao();
        con.conexao.setAutoCommit(true);
        Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        //busca todas as informações de acordo com os dados fornecidos
        st.execute("SELECT * FROM `bibliotec`.`usuarios` u WHERE u.ativo = '1';");
        ResultSet rs = st.getResultSet();

        //obtendo os valores carregados no result set e carregado no arrayList
        while (rs.next()) {
            Usuario usuario_temp = new Usuario(
                    rs.getString("nome"),
                    rs.getInt("codusuario"),
                    docsFormat.formataCpf(rs.getString("cpf")),
                    rs.getString("email"),
                    docsFormat.formataRg(rs.getString("rg")),
                    dtFormat.formatadorDatasBrasil(rs.getString("datanasc"))
            );
            usuarios_emp.add(usuario_temp);
        }
        //fechando as conexões em aberto para evitar locks infinitos no banco de dados
        st.close();
        rs.close();
        con.conexao.close();

        return usuarios_emp;
    }

    public List<Livro> consultaLivrosEmp() throws SQLException {
        List<Livro> livros_emp = new ArrayList<Livro>();

        //realiza conexão com banco de dados
        Conexao con = new Conexao();
        con.conexao.setAutoCommit(true);
        Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        //busca todas as informações de acordo com os dados fornecidos
        st.execute("SELECT * FROM `bibliotec`.`livro` l WHERE l.ativo = '1' and l.disponibilidade = '1';");
        ResultSet rs = st.getResultSet();

        //obtendo os valores carregados no result set e carregado no arrayList
        while (rs.next()) {
            Livro livros_temp = new Livro(
                    rs.getInt("codlivro"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getString("editora"),
                    rs.getString("anolancamento"),
                    rs.getString("codcatalogacao")
            );
            livros_emp.add(livros_temp);
        }
        //fechando as conexões em aberto para evitar locks infinitos no banco de dados
        st.close();
        rs.close();
        con.conexao.close();

        return livros_emp;
    }

    public void cadastrarEmprestimo(Emprestimo emprestimo) throws SQLException {
        /*String datadev = "", dataemp = "", email_user_emp = "", titulo_book_emp = "", nome_user_emp = "";

        try {
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            int atrasado = consultarEmpAtrasados(emp.getCodusuario());
            if(atrasado != 0){
                return -2;
            }

            //obtendo dados para imprimir na mensagem de retorno
            st.execute("SELECT u.nome, u.email FROM `bibliotec`.`usuarios` u WHERE u.codusuario = '"+emp.getCodusuario()+"'");
            rs = st.getResultSet();
            while (rs.next()){
                nome_user_emp = rs.getString("nome").trim();
                email_user_emp = rs.getString("email").trim();
            }

            st.execute("SELECT l.titulo FROM `bibliotec`.`livro` l WHERE l.codlivro = '"+emp.getCodlivro()+"'");
            rs = st.getResultSet();
            while (rs.next()){
                titulo_book_emp = rs.getString("titulo");
            }

            //obter usuário da reserva
            st.execute("select coalesce(l.usuariores,0) as usuariores from `bibliotec`.`livro` l where l.codlivro = '"+emp.getCodlivro()+"';");
            int usuariores = 0;
            rs = st.getResultSet();
            while(rs.next()){
                usuariores = rs.getInt("usuariores");
            }

            // se não tiver reserva ou se usuario_reserva == usuario_emprestimo
            if(usuariores == 0 || usuariores == emp.getCodusuario()) {
                //limpando data reserva do novo livro do emprestimo
                if (usuariores == emp.getCodusuario()) {
                    st.executeUpdate("UPDATE `bibliotec`.`livro` l set l.datares = null, l.usuariores = null where l.codlivro = '" + emp.getCodlivro() + "';");
                }

                //Inserindo um novo emprestimo e auterando a disponibilidade do livro
                st.executeUpdate("INSERT INTO `bibliotec`.`emprestimo` (`codusuario`, `codlivro`, `dataemp`, `datadev`, `ativo`) VALUES ('"+emp.getCodusuario()+"', '"+emp.getCodlivro()+"', current_date(), DATE_ADD(current_date(), INTERVAL 7 DAY) , '1');");
                st.executeUpdate("UPDATE `bibliotec`.`livro` l set l.disponibilidade = '0' where l.codlivro = '"+emp.getCodlivro()+"';");

                //Envio de e-mail ao cadastrar empréstimo
                st.execute("SELECT max(datadev) as datadev, current_date() as dataemp from `bibliotec`.`emprestimo` e where e.codusuario = '"+emp.getCodusuario()+"';");
                rs = st.getResultSet();
                while(rs.next()){
                    datadev = dtFormat.formatadorDatasBrasil(rs.getString("datadev"));
                    dataemp = dtFormat.formatadorDatasBrasil(rs.getString("dataemp"));
                }

                //Enviando e-mail ao finalizar o cadastro de emprestimo
                email.setAssunto("Empréstimo de Livro - Biblioteca X");
                email.setEmailDestinatario(email_user_emp);
                email.setMsg("Olá "+nome_user_emp+", <br><br>O empréstimo do livro <b>'"+titulo_book_emp+"'</b> foi realizado com sucesso! <br><br> Data do Empréstimo: <b>"+dataemp+"</b>. <br> Data da Devolução...: <b>"+datadev+"</b>. <br><br>Fique atento à data de devolução.");
                email.enviarGmail();
            }else{
                return 0;
            }

            //fechando as conexões
            st.close();
            con.conexao.close();

            return 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage().trim());
            return -1;
        }*/
        try{
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            st.executeUpdate("INSERT INTO `bibliotec`.`emprestimo` (`codusuario`, `codlivro`, `dataemp`, `datadev`, `ativo`) VALUES ('"+emprestimo.getCodusuario()+"', '"+emprestimo.getCodlivro()+"', current_date(), DATE_ADD(current_date(), INTERVAL 7 DAY) , '1');");

            st.executeUpdate("UPDATE `bibliotec`.`livro` SET `disponibilidade` = '0' WHERE (`codlivro` = '"+emprestimo.getCodlivro()+"');");

            st.execute( "select\n" +
                    "\tMAX(e.codemprestimo) as ultimoEmprestimo,\n" +
                    "\tu.nome,\n" +
                    "    u.email,\n" +
                    "    l.titulo,\n" +
                    "    e.dataemp,\n" +
                    "    e.datadev\n" +
                    "from\n" +
                    "\temprestimo e\n" +
                    "inner join\n" +
                    "\tusuarios   u on u.codusuario = e.codusuario\n" +
                    "inner join\n" +
                    "\tlivro      l on l.codlivro = e.codlivro\n" +
                    "where\n" +
                    "\te.ativo = '1' and\n" +
                    "    e.codusuario = '"+emprestimo.getCodusuario()+"' and\n" +
                    "    e.codlivro = '"+emprestimo.getCodlivro()+"';");

            ResultSet rs = st.getResultSet();

            while (rs.next()){
                emprestimo.setCodemprestimo(rs.getInt("ultimoEmprestimo"));
                emprestimo.setNome_user(rs.getString("nome"));
                emprestimo.setEmail_user(rs.getString("email"));
                emprestimo.setTitulo_book(rs.getString("titulo"));
                emprestimo.setDataemp(dtFormat.formatadorDatasBrasil(rs.getString("dataemp")));
                emprestimo.setDatadev(dtFormat.formatadorDatasBrasil(rs.getString("datadev")));
            }

            st.close();
            rs.close();
            con.conexao.close();

            email.setAssunto("Empréstimo de Livro - Biblioteca X");
            email.setEmailDestinatario(emprestimo.getEmail_user());
            email.setMsg("Olá "+emprestimo.getNome_user()+", <br><br>O empréstimo do livro <b>'"+emprestimo.getTitulo_book()+"'</b> foi realizado com sucesso! <br><br> Data do Empréstimo: <b>"+emprestimo.getDataemp()+"</b>. <br> Data da Devolução...: <b>"+emprestimo.getDatadev()+"</b>. <br><br>Fique atento à data de devolução.");
            email.enviarGmail();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            emprestimo.setMsg_retorno("FALHA: Ocorreu uma falha ao cadastrar o empréstimo, contacte o administrador.");
            emprestimo.setColor_msg_retorno("red");
        }
    }

    public List<Emprestimo> meusEmprestimos() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String login = (String)session.getAttribute("usuario");

        List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        try {
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            //busca todas as informações de acordo com os dados de acesso do usuário
            st.execute("SELECT \n" +
                    "    l.titulo, \n" +
                    "    l.autor, \n" +
                    "    l.editora, \n" +
                    "    e.dataemp, \n" +
                    "    e.datadev,\n" +
                    "    CASE\n" +
                    "\t\tWHEN e.datadev < current_date() THEN '1'\n" +
                    "        ELSE '0'\n" +
                    "    END AS atrasado\n" +
                    "FROM\n" +
                    "    emprestimo e\n" +
                    "        LEFT JOIN\n" +
                    "    livro l ON l.codlivro = e.codlivro\n" +
                    "        LEFT JOIN\n" +
                    "    usuarios u ON u.codusuario = e.codusuario\n" +
                    "WHERE\n" +
                    "    u.usuario LIKE '" + login + "' AND e.ativo = '1';");

            rs = st.getResultSet();

            while(rs.next()){
                Emprestimo emp_temp = new Emprestimo(
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        dtFormat.formatadorDatasBrasil(rs.getString("dataemp")),
                        dtFormat.formatadorDatasBrasil(rs.getString("datadev")),
                        rs.getInt("atrasado")

                );
                emprestimos.add(emp_temp);
            }

            //fechando as conexões em aberto para evitar locks infinitos no banco de dados
            st.close();
            rs.close();
            con.conexao.close();
        } catch (SQLException e) {
            System.out.println("Dados informados são inválidos!");
        }
        return emprestimos;
    }

    public List<Emprestimo> consultarEmprestimos(Emprestimo emp){
        List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        try {
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            emp.setTitulo_book(emp.getNome_user());

            //busca todas as informações de acordo com os dados fornecidos
            st.execute("select\n" +
                    "\te.codemprestimo,\n" +
                    "    u.codusuario,\n" +
                    "    u.nome,\n" +
                    "    u.email,\n" +
                    "    l.codlivro,\n" +
                    "    l.titulo,\n" +
                    "    l.autor,\n" +
                    "    l.editora,\n" +
                    "    l.anolancamento,\n" +
                    "    e.dataemp,\n" +
                    "    e.datadev,\n" +
                    "    e.dataalt,\n" +
                    "  case\n" +
                    "\t\twhen e.ativo = 1 then 'Em vigor'\n" +
                    "    when e.ativo = 0 then 'Finalizado'\n" +
                    "\tend as status\n" +
                    "from\n" +
                    "\temprestimo e\n" +
                    "left join\n" +
                    "\tlivro l on l.codlivro = e.codlivro\n" +
                    "left join\n" +
                    "\tusuarios u on u.codusuario = e.codusuario\n" +
                    "where\n" +
                    "\tu.nome like '%"+emp.getNome_user()+"%' or\n" +
                    "\tl.titulo like '%"+emp.getTitulo_book()+"%' order by 1;");

            rs = st.getResultSet();
            while(rs.next()){
                Emprestimo emp_temp = new Emprestimo(
                        rs.getInt("codemprestimo"),
                        rs.getInt("codusuario"),
                        rs.getInt("codlivro"),
                        dtFormat.formatadorDatasBrasil(rs.getString("dataemp")),
                        dtFormat.formatadorDatasBrasil(rs.getString("datadev")),
                        dtFormat.formatadorDatasBrasil(rs.getString("dataalt")),
                        0,
                        "",
                        "",
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        rs.getString("anolancamento"),
                        rs.getString("status")
                );
                emprestimos.add(emp_temp);
            }

            //fechando as conexões em aberto para evitar locks infinitos no banco de dados
            st.close();
            rs.close();
            con.conexao.close();
        } catch (SQLException e) {
            System.out.println("Dados informados são inválidos!");
        }

        return emprestimos;
    }

    public List<Emprestimo> consultarEmprestimosEmVigor(Emprestimo emp){
        List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        try {
            //realiza conexão com banco de dados bibliotec
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            emp.setTitulo_book(emp.getNome_user());

            //busca todas as informações de acordo com os dados fornecidos
            st.execute("SELECT \n" +
                    "    e.codemprestimo,\n" +
                    "    u.codusuario,\n" +
                    "    u.nome,\n" +
                    "    u.email,\n" +
                    "    u.cpf,\n" +
                    "    u.rg,\n" +
                    "    l.codlivro,\n" +
                    "    l.titulo,\n" +
                    "    l.autor,\n" +
                    "    l.editora,\n" +
                    "    l.anolancamento,\n" +
                    "    e.dataemp,\n" +
                    "    e.datadev,\n" +
                    "    e.dataalt,\n" +
                    "    CASE\n" +
                    "        WHEN e.ativo = 1 THEN 'Em vigor'\n" +
                    "        WHEN e.ativo = 0 THEN 'Finalizado'\n" +
                    "    END AS status\n" +
                    "FROM\n" +
                    "    emprestimo e\n" +
                    "        LEFT JOIN\n" +
                    "    livro l ON l.codlivro = e.codlivro\n" +
                    "        LEFT JOIN\n" +
                    "    usuarios u ON u.codusuario = e.codusuario\n" +
                    "WHERE\n" +
                    "    (u.nome LIKE '%"+emp.getNome_user()+"%'\n" +
                    "\tOR l.titulo LIKE '%"+emp.getTitulo_book()+"%')\n" +
                    "\tAND e.ativo = '1'\n" +
                    "ORDER BY 1;");

            ResultSet rs = st.getResultSet();

            while(rs.next()){
                Emprestimo empr = new Emprestimo(
                        rs.getInt("codemprestimo"),
                        rs.getInt("codusuario"),
                        rs.getInt("codlivro"),
                        dtFormat.formatadorDatasBrasil(rs.getString("dataemp")),
                        dtFormat.formatadorDatasBrasil(rs.getString("datadev")),
                        dtFormat.formatadorDatasBrasil(rs.getString("dataalt")),
                        1,
                        "",
                        "",
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        rs.getString("anolancamento"),
                        rs.getString("status"),
                        docsFormat.formataRg(rs.getString("rg")),
                        docsFormat.formataCpf(rs.getString("cpf"))
                );
                emprestimos.add(empr);
            }

            //fechando as conexões em aberto para evitar locks infinitos no banco de dados
            st.close();
            rs.close();
            con.conexao.close();
        } catch (SQLException e) {
            System.out.println("Dados informados são inválidos!");
        }

        return emprestimos;
    }

    public void finalizarEmprestimo(Emprestimo emprestimo){
        Livro livroObserver = new Livro();
        Usuario usuarioObserver = new Usuario(livroObserver);
        Reserva reserva = new Reserva();
        ReservaDao reservaDao = new ReservaDao();

        try{
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //alterando status do empréstimo
            st.executeUpdate("UPDATE \n" +
                    "\temprestimo e \n" +
                    "SET \n" +
                    "    e.dataentr = CURRENT_DATE(),\n" +
                    "    e.dataalt = CURRENT_DATE(),\n" +
                    "    ativo = '0'\n" +
                    "WHERE\n" +
                    "    e.codemprestimo = '"+emprestimo.getCodemprestimo()+"' AND \n" +
                    "    e.ativo = '1';");

            //alterando status do livro
            st.executeUpdate("UPDATE \n" +
                    "\tlivro l \n" +
                    "SET \n" +
                    "    l.disponibilidade = '1'\n" +
                    "WHERE\n" +
                    "    l.codlivro = '"+emprestimo.getCodlivro()+"' and\n" +
                    "    l.ativo = '1';");

            //obtendo dados do usuário do empréstimo, para comunicá-lo quanto ao sucesso na devolução
            st.execute("SELECT \n" +
                    "    u.nome,\n" +
                    "    u.email,\n" +
                    "    l.titulo,\n" +
                    "    e.dataemp,\n" +
                    "    e.dataentr\n" +
                    "FROM\n" +
                    "    emprestimo e\n" +
                    "INNER JOIN\n" +
                    "    usuarios u ON u.codusuario = e.codusuario\n" +
                    "INNER JOIN\n" +
                    "    livro l ON l.codlivro = e.codlivro\n" +
                    "WHERE\n" +
                    "    e.ativo = '0' and \n" +
                    "    e.codemprestimo = '"+emprestimo.getCodemprestimo()+"';");

            ResultSet rs = st.getResultSet();

            while (rs.next()){
                emprestimo.setNome_user(rs.getString("nome"));
                emprestimo.setEmail_user(rs.getString("email"));
                emprestimo.setTitulo_book(rs.getString("titulo"));
                emprestimo.setDataemp(dtFormat.formatadorDatasBrasil(rs.getString("dataemp")));
                emprestimo.setDataEntrega(dtFormat.formatadorDatasBrasil(rs.getString("dataentr")));
            }

            email.setAssunto("Devolução de Livro - Biblioteca X");
            email.setEmailDestinatario(emprestimo.getEmail_user());
            email.setMsg("Olá "+emprestimo.getNome_user()+", <br><br>O livro <b>'"+emprestimo.getTitulo_book()+"'</b> foi devolvido com sucesso! <br><br> Data do Empréstimo: <b>"+emprestimo.getDataemp()+"</b>. <br> Data da Entrega...: <b>"+emprestimo.getDataEntrega()+"</b>.");
            email.enviarGmail();

            //tratando caso o livro esteja reservado(OBSERVER)
            reserva.setCodLivro(emprestimo.getCodlivro());

            System.out.println(emprestimo.getCodlivro());
            System.out.println("teste1");

            System.out.println(reservaDao.livroJaReservadoQualquerUsuario(reserva));

            if(reservaDao.livroJaReservadoQualquerUsuario(reserva) > 0){
                System.out.println("teste2");
                reserva.setCodUsuario(reservaDao.obterDadosReserva(reserva,false));
                System.out.println("teste3");
                reservaDao.atualizarStatusReserva(reserva);
                System.out.println("teste4");
                reservaDao.obterDadosAlunoReservaObserver(reserva, livroObserver);
                System.out.println("teste5");
            }

            st.close();
            rs.close();
            con.conexao.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            emprestimo.setMsg_retorno("FALHA: Ocorreu uma falha ao dar baixa em livro.");
            emprestimo.setColor_msg_retorno("red");
        }

    }

    public int editarEmprestimo(Emprestimo emp) throws ParseException {
        try{
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            //TRATANDO A ALTERAÇÃO DO LIVRO
            if(emp.getCodlivro()!=0){
                //verificando se o livro está reservado para outra pessoa
                st.execute("select coalesce(l.usuariores,0) as usuariores from `bibliotec`.`livro` l where l.codlivro = '"+emp.getCodlivro()+"';");
                int usuariores = 0;
                rs = st.getResultSet();
                while(rs.next()){
                    usuariores = rs.getInt("usuariores");
                }

                st.execute("select coalesce(u.codusuario,0) as codusuario from `bibliotec`.`emprestimo` u where u.codemprestimo = '"+emp.getCodemprestimo()+"';");
                int cod_usuario = 0;
                rs = st.getResultSet();
                while(rs.next()){
                    cod_usuario = rs.getInt("codusuario");
                }

                // sem reserva     || usuario_reserva == novo_usuario   || usuario_reserva == usuario_emprestimo_atual/anterior
                if(usuariores == 0 || usuariores == emp.getCodusuario() || usuariores == cod_usuario){

                    //limpando data reserva do novo livro do emprestimo
                    //usuario_reserva == novo_usuario   || usuario_reserva == usuario_emprestimo_atual/anterior
                    if(usuariores == emp.getCodusuario() || usuariores == cod_usuario){
                        st.executeUpdate("UPDATE `bibliotec`.`livro` l set l.datares = null, l.usuariores = null where l.codlivro = '"+emp.getCodlivro()+"';") ;
                    }

                    //obtendo o codlivro anterior e a data reserva se tiver
                    st.execute("SELECT \n" +
                                   "    e.codlivro, coalesce(l.datares,'') as datares\n" +
                                   "FROM\n" +
                                   "    emprestimo e\n" +
                                   "        LEFT JOIN\n" +
                                   "    livro l ON l.codlivro = e.codlivro\n" +
                                   "WHERE\n" +
                                   "    e.codemprestimo = '"+emp.getCodemprestimo()+"';");

                    int livro_anterior = 0;
                    String datares_anterior = "";
                    rs = st.getResultSet();
                    while(rs.next()){
                        livro_anterior = rs.getInt("codlivro");
                        datares_anterior = rs.getString("datares").trim();
                    }

                    //se data reserva diferente de vazio, então deverá ser atualizado...
                    if(!datares_anterior.equals("")){
                        st.executeUpdate("UPDATE `bibliotec`.`livro` l set l.disponibilidade = '1', l.datares = DATE_ADD(current_date(), INTERVAL 1 DAY) where l.codlivro = '"+livro_anterior+"';");
                    }else{
                        st.executeUpdate("UPDATE `bibliotec`.`livro` l set l.disponibilidade = '1' where l.codlivro = '"+livro_anterior+"';");
                    }

                    //atualizando disponibilidade do novo livro e as informações do emprestimo
                    st.executeUpdate("update `bibliotec`.`livro` l set l.disponibilidade = '0' where l.codlivro = '"+emp.getCodlivro()+"';");
                    st.executeUpdate("UPDATE `bibliotec`.`emprestimo` e SET e.codlivro = '"+emp.getCodlivro()+"', e.dataalt = current_date() WHERE e.codemprestimo = '"+emp.getCodemprestimo()+"';");
                }else{
                    return -3;
                }
            }

            //TRATANDO A ALTERAÇÃO DO CODUSUARIO
            if(emp.getCodusuario()!=0){
                //verificando se o novo usuario do emprestimo possui restrições/pendências
                if(consultarEmpAtrasados(emp.getCodusuario()) > 0){
                    return -4;
                }
                st.executeUpdate("UPDATE `bibliotec`.`emprestimo` e SET e.codusuario = '"+emp.getCodusuario()+"', e.dataalt = current_date() WHERE e.codemprestimo = '"+emp.getCodemprestimo()+"';");
            }

            //TRATANDO A ALTERAÇÃO DA DATA DE DEVOLUÇÃO
            if(!emp.getDatadev().equals("".trim())){
                //convertendo nova data de devolução
                emp.setDatadev(dtFormat.formatadorDatasMySQL(emp.getDatadev()));

                String datares = "", data_atual = "";

                st.execute("SELECT \n" +
                        "    CASE\n" +
                        "        WHEN l.datares <= '"+emp.getDatadev()+"' THEN 'Maior'\n" +
                        "        ELSE 'Menor'\n" +
                        "    END AS datares,\n" +
                        "    current_date() as data_atual\n" +
                        "FROM\n" +
                        "    emprestimo e\n" +
                        "        LEFT JOIN\n" +
                        "    livro l ON l.codlivro = e.codlivro\n" +
                        "WHERE\n" +
                        "    e.codemprestimo = '"+emp.getCodemprestimo()+"';");

                rs = st.getResultSet();
                while(rs.next()){
                    datares = rs.getString("datares").trim();
                    data_atual = rs.getString("data_atual").trim();
                }

                if(emp.getCodlivro() == 0){
                    //se a data de devolução for >= que data devolução então é barrado
                    if(datares.equals("Maior")){
                        return -2;
                    }

                }else{
                    st.execute("SELECT \n" +
                                    "    CASE\n" +
                                    "        WHEN l.datares <= '"+emp.getDatadev()+"'\n" +
                                    "\t\t\tTHEN 'Maior'\n" +
                                    "\t\t\tELSE 'Menor'\n" +
                                    "    END AS datares\n" +
                                    "FROM\n" +
                                    "    emprestimo e\n" +
                                    "        LEFT JOIN\n" +
                                    "    livro l ON l.codlivro = e.codlivro\n" +
                                    "WHERE\n" +
                                    "    e.codlivro ='"+emp.getCodlivro()+"' and e.ativo = '1';");
                    rs = st.getResultSet();
                    while(rs.next()){
                        datares = rs.getString("datares");
                    }

                    if(datares.equals("Maior")){
                        return 0;
                    }
                }

                //não permite data de devolução MENOR que a data atual
                if(dtFormat.validaDatas(emp.getDatadev().trim()) >= 0) {
                    st.executeUpdate("UPDATE `bibliotec`.`emprestimo` e SET e.datadev = '"+emp.getDatadev()+"', e.dataalt = current_date() WHERE e.codemprestimo = '"+emp.getCodemprestimo()+"';");
                }else{
                    return -5;
                }


            }
        }catch (SQLException e){
            return -1;
        }
        return 1;
    }

    public int consultarMeusEmpAtrasados(){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String login = (String)session.getAttribute("usuario");
        int qtde_atrasado = 0;

        try{
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            st.execute( "select\n" +
                            "\tcount(coalesce(e.codemprestimo,0)) as qtde\n" +
                            "from\n" +
                            "\temprestimo e\n" +
                            "inner join\n" +
                            "\tusuarios   u on u.codusuario = e.codusuario\t\n" +
                            "where\n" +
                            "\te.ativo = '1' and\n" +
                            "    e.datadev < current_date() and\n" +
                            "    u.usuario = '" + login.trim() + "';");

            rs = st.getResultSet();
            while(rs.next()){
                qtde_atrasado = rs.getInt("qtde");
            }

            st.close();
            rs.close();
        }catch (SQLException e) {
            System.out.println("Erro ao consultar empréstimos atrasados!");
        }
        return qtde_atrasado;
    }

    public int consultarEmpAtrasados(int codusuario){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String login = (String)session.getAttribute("usuario");
        int qtde_atrasado = 0;

        try{
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = null;

            st.execute( "select\n" +
                            "\tcount(coalesce(e.codemprestimo,0)) as qtde\n" +
                            "from\n" +
                            "\temprestimo e\n" +
                            "inner join\n" +
                            "\tusuarios   u on u.codusuario = e.codusuario\t\n" +
                            "where\n" +
                            "\te.ativo = '1' and\n" +
                            "    e.datadev < current_date() and\n" +
                            "    u.codusuario = '" + codusuario + "';");

            rs = st.getResultSet();
            while(rs.next()){
                qtde_atrasado = rs.getInt("qtde");
            }

            st.close();
            rs.close();
        }catch (SQLException e) {
            System.out.println("Erro ao consultar empréstimos atrasados!");
        }
        return qtde_atrasado;
    }

    public int livroJaEmprestado(Reserva reserva){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String usuarioLogado = (String)session.getAttribute("usuario");
        int jaEmprestado = 0;

        try{
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs;

            st.execute( "select\n" +
                    "\tcoalesce(e.codemprestimo,0) jaEmprestado\n" +
                    "from\n" +
                    "\temprestimo e\n" +
                    "inner join\n" +
                    "\tusuarios   u on u.codusuario = e.codusuario\n" +
                    "where\n" +
                    "\te.codlivro = '"+reserva.getCodLivro()+"' and\n" +
                    "\te.ativo = '1' and\n" +
                    "    u.usuario = '"+usuarioLogado+"';");

            rs = st.getResultSet();

            while(rs.next()){
                jaEmprestado = rs.getInt("jaEmprestado");
            }

            st.close();
            rs.close();
            con.conexao.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            reserva.setMsgRetorno("FALHA: Este livro já está reservado para você.");
            reserva.setColorMsgRetorno("red");
        }
        return jaEmprestado;
    }

    public int quantidadeDiasAtrasados(Emprestimo emprestimo){
        int qtdeDiasAtrasados = 0;
        try{
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs;

            st.execute( "SELECT \n" +
                    "    CASE\n" +
                    "\t\tWHEN COALESCE(DATEDIFF (CURRENT_DATE(), e.datadev),0) > 0 THEN COALESCE(DATEDIFF (CURRENT_DATE(), e.datadev),0)\n" +
                    "        ELSE 0\n" +
                    "    END AS qtdeDiasAtrasados,\n" +
                    "    e.codlivro,\n" +
                    "    e.codusuario\n" +
                    "FROM\n" +
                    "    emprestimo e\n" +
                    "        INNER JOIN\n" +
                    "    usuarios u ON u.codusuario = e.codusuario\n" +
                    "WHERE\n" +
                    "    e.ativo = '1' AND\n" +
                    "    e.codemprestimo = '"+emprestimo.getCodemprestimo()+"';");

            rs = st.getResultSet();

            while (rs.next()){
                qtdeDiasAtrasados = rs.getInt("qtdeDiasAtrasados");
                emprestimo.setCodlivro(rs.getInt("codlivro"));
                emprestimo.setCodusuario(rs.getInt("codusuario"));
            }

            st.close();
            rs.close();
            con.conexao.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            emprestimo.setMsg_retorno("FALHA: Ocorreu uma falha ao consultar dias de atraso do empréstimo, contacte o administrador.");
            emprestimo.setColor_msg_retorno("red");
        }
        return qtdeDiasAtrasados;
    }
}
>>>>>>> parent of 86e4794... Feito a utilização de Threads para envio de e-mails.
