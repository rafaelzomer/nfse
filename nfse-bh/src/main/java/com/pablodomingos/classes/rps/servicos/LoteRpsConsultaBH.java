package com.pablodomingos.classes.rps.servicos;

import com.pablodomingos.classes.rps.RpsPrestadorBH;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Root(name="ConsultarLoteRpsEnvio")
public class LoteRpsConsultaBH extends AbstractServiceBH {

  @Attribute(name="xmlns")
  private String xmlns = "http://www.abrasf.org.br/nfse.xsd";

  @Element(name="Prestador")
  @NotNull
  private RpsPrestadorBH prestador;

  @Element(name="Protocolo")
  @NotNull
  @Size(max = 50)
  private String numeroProtocolo;
  
  public LoteRpsConsultaBH(String numeroProtocolo, RpsPrestadorBH prestador) {
    super();
    this.numeroProtocolo = numeroProtocolo;
    this.prestador = prestador;
  }

  public String getNumeroProtocolo() {
    return numeroProtocolo;
  }

  public RpsPrestadorBH getPrestador() {
    return prestador;
  }
  
}