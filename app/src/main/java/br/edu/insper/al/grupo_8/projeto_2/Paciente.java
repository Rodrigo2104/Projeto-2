package br.edu.insper.al.grupo_8.projeto_2;


public class Paciente {
    private String nome, rh, data_internacao, idade, sexo, diagnostico, cor, estado_civil, escolaridade, ocupacao, provedor, renda_familiar, nPessoas,
            religiao, habitos, alta, procedencia, queixa, pa, p, r, tmax, dx, antecedentes, outros, medicamentos_casa, medicamentos_hospital, anti_coagulacao,
            dor,  tratamentos_anteriores, exame_fisico, consciencia, pulmonar, cardiovascular, gastrointestinal, geniturinario, extremidades, pea,
            renda_idoso;

    private int t01, t02, t03, t04, t05, t08, t09, t10;
    
    public Paciente() {
    }

    public Paciente(String nome, String rh, String data_internacao, String idade, String sexo, String diagnostico, String cor,
                    String estado_civil, String escolaridade, String ocupacao, String provedor, String renda_familiar, String nPessoas,
                    String religiao, String habitos, String alta, String procedencia, String queixa, String pa, String p, String r, String tmax,
                    String dx, String antecedentes, String outros, String medicamentos_casa, String medicamentos_hospital, String anti_coagulacao,
                    String dor, String tratamentos_anteriores, String exame_fisico, String consciencia, String pulmonar, String cardiovascular,
                    String gastrointestinal, String geniturinario, String extremidades, String pea, String renda_idoso,
                    int t01, int t02, int t03, int t04, int t05, int t08, int t09, int t10) {

        this.nome = nome;
        this.rh = rh;
        this.data_internacao = data_internacao;
        this.idade = idade;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
        this.cor = cor;
        this.estado_civil = estado_civil;
        this.escolaridade = escolaridade;
        this.ocupacao = ocupacao;
        this.renda_idoso = renda_idoso;
        this.provedor = provedor;
        this.renda_familiar = renda_familiar;
        this.nPessoas = nPessoas;
        this.religiao = religiao;
        this.habitos = habitos;
        this.alta = alta;
        this.procedencia = procedencia;
        this.queixa = queixa;
        this.pa = pa;
        this.p = p;
        this.r = r;
        this.tmax = tmax;
        this.dx = dx;
        this.antecedentes = antecedentes;
        this.outros = outros;
        this.medicamentos_casa = medicamentos_casa;
        this.medicamentos_hospital = medicamentos_hospital;
        this.anti_coagulacao = anti_coagulacao;
        this.dor = dor;
        this.tratamentos_anteriores = tratamentos_anteriores;
        this.exame_fisico = exame_fisico;
        this.consciencia = consciencia;
        this.pulmonar = pulmonar;
        this.cardiovascular = cardiovascular;
        this.gastrointestinal = gastrointestinal;
        this.geniturinario = geniturinario;
        this.extremidades = extremidades;
        this.pea = pea;
        this.t01 = t01;
        this.t02 = t02;
        this.t03 = t03;
        this.t04 = t04;
        this.t05 = t05;
        this.t08 = t08;
        this.t09 = t09;
        this.t10 = t10;
    }

    public int getT01() {
        return t01;
    }

    public void setT01(Integer t01) {
        this.t01 = t01;
    }

    public int getT02() {
        return t02;
    }

    public void setT02(Integer t02) {
        this.t02 = t02;
    }

    public int getT03() {
        return t03;
    }

    public void setT03(Integer t03) {
        this.t03 = t03;
    }

    public int getT04() {
        return t04;
    }

    public void setT04(Integer t04) {
        this.t04 = t04;
    }

    public int getT05() {
        return t05;
    }

    public void setT05(Integer t05) {
        this.t05 = t05;
    }

    public int getT08() {
        return t08;
    }

    public void setT08(Integer t08) {
        this.t08 = t08;
    }

    public int getT09() {
        return t09;
    }

    public void setT09(Integer t09) {
        this.t09 = t09;
    }

    public int getT10() {
        return t10;
    }

    public void setT10(Integer t10) {
        this.t10 = t10;
    }

    public String getRenda_familiar() {
        return renda_familiar;
    }

    public void setRenda_familiar(String renda_familiar) {
        this.renda_familiar = renda_familiar;
    }

    public String getnPessoas() {
        return nPessoas;
    }

    public void setnPessoas(String nPessoas) {
        this.nPessoas = nPessoas;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getAlta() {
        return alta;
    }

    public void setAlta(String alta) {
        this.alta = alta;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getTmax() {
        return tmax;
    }

    public void setTmax(String tmax) {
        this.tmax = tmax;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public String getMedicamentos_casa() {
        return medicamentos_casa;
    }

    public void setMedicamentos_casa(String medicamentos_casa) {
        this.medicamentos_casa = medicamentos_casa;
    }

    public String getMedicamentos_hospital() {
        return medicamentos_hospital;
    }

    public void setMedicamentos_hospital(String medicamentos_hospital) {
        this.medicamentos_hospital = medicamentos_hospital;
    }

    public String getAnti_coagulacao() {
        return anti_coagulacao;
    }

    public void setAnti_coagulacao(String anti_coagulacao) {
        this.anti_coagulacao = anti_coagulacao;
    }

    public String getDor() {
        return dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public String getTratamentos_anteriores() {
        return tratamentos_anteriores;
    }

    public void setTratamentos_anteriores(String tratamentos_anteriores) {
        this.tratamentos_anteriores = tratamentos_anteriores;
    }

    public String getExame_fisico() {
        return exame_fisico;
    }

    public void setExame_fisico(String exame_fisico) {
        this.exame_fisico = exame_fisico;
    }

    public String getConsciencia() {
        return consciencia;
    }

    public void setConsciencia(String consciencia) {
        this.consciencia = consciencia;
    }

    public String getPulmonar() {
        return pulmonar;
    }

    public void setPulmonar(String pulmonar) {
        this.pulmonar = pulmonar;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getGastrointestinal() {
        return gastrointestinal;
    }

    public void setGastrointestinal(String gastrointestinal) {
        this.gastrointestinal = gastrointestinal;
    }

    public String getGeniturinario() {
        return geniturinario;
    }

    public void setGeniturinario(String geniturinario) {
        this.geniturinario = geniturinario;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getPea() {
        return pea;
    }

    public void setPea(String pea) {
        this.pea = pea;
    }

    public String getRenda_idoso() {
        return renda_idoso;
    }

    public void setRenda_idoso(String renda_idoso) {
        this.renda_idoso = renda_idoso;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getData_internacao() {
        return data_internacao;
    }

    public void setData_internacao(String data_internacao) {
        this.data_internacao = data_internacao;
    }
}
