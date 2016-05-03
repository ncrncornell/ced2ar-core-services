package edu.ncrn.cornell.view

import edu.ncrn.cornell.view.common.Ced2arView

import scalatags.Text.all._
import scala.collection.JavaConversions._
import scala.collection.Map


class VarsView extends Ced2arView{
  
  def varsList(
        variables : java.util.Map[String, String],
        handle : String
        ) : String = {
    val typedHtml = html(
        head(
        defaultMetaTags,
        defaultStyleSheetsAndScripts
      ),
        body(masterDiv(
        topBanner,
        navBar,
        ol(cls:="breadcrumb")(
            li(a(href:= "/ced2ar-rdb/codebooks")("Codebooks")),
            li(a(href:= "/ced2ar-rdb/codebooks/"+handle)(handle)),
            li(cls:="active")("Variables")
        ),
        h2("Variables"),
        masterDiv(
            masterTable(
              variables.map{ case (varname, varlabl) =>
                  tr(
                     td(   
                        a(href:="/ced2ar-rdb/codebooks/"+handle+"/vars/"+varname)
                        (varname)
                     ),
                     td( varlabl)
                   )
              }.toSeq
            )
          )
        )
      )
    )
    typedHtml.toString()
  }
  
  
}