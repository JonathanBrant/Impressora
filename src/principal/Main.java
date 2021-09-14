package principal;

import classesExImpressora.Contrato;
import classesExImpressora.Documento;
import classesExImpressora.Foto;
import classesExImpressora.Impressora;

public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("docx");

        Foto foto = new Foto();
        foto.setNome("Festa");
        foto.setTipo("png");

        Documento documento = new Documento();
        documento.setNome("Teste");
        documento.setTipo("doc");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(foto);
        Impressora.adicionarImprimivel(documento);

        Impressora.imprimirTudo();

    }
}
