package com.automation.oficeHours;

public class OH_Locators {
    /*find the Locators==>right click and click==>inspect(denetleme-kontrol)
    colors referst to: purple:tag, brown:class,id...==> attribute,  black: Text, Green/blue:value
   8 locators: 1.id, 2.tagName, 3.className, 4.name, 5.linkText(<a href), 6.partialLinkText,
   7.xpath(a.Absolute Xpath(start with"/"slash) and b.Relative Xpath start with"//" ),
      //tagname[@attribute='value']
       //tagname[text()='value']

      1.Any Tage:tag name Will be replaced with a *(Dynamic(changing) Elements*
      //*[@attribute='value']
      2.Operator 'and' ==> combine two different attributes to find a sigle Element

      //tagname[@attribute1='value1' and @attribute2='value2']
      //tagname[@attribute1='value1'][@attribute2='value2']

       3.Operator 'or'==>//tagname[@attribute1='value1' or @attribute2='value2']
       4.Attribute 'starts-with'==> //tagName[starts-with(@attribute,'value')]
                 value==>could be partial value or begin of a value
       5.Attribute 'ends-with'==>Not:xPath usely doesn work ends with!!
                               //tagName[ends-with(@attribute,'value')]
                               //tagName[ends-with(text(),'value')]
       6.Attribute 'contains'==> //tagName[contains(@attribute,'value')]
                     //tagName[contains(text(),'value')]
       7. Any Attribute  ==> //tagName[@* ,'value')]
       8.How to go from child to parrent element:( /.. )
         //button[text()='button1']/..
         go to the grandparent==>//button[text()='button1']/../..
         directions: back and forward, ability to find element by /followinf-sibling::tagname-get the sibling that is
         located under the element.
         Example:
         <div>
            <input type="text" name="age">
            <label>Enter yor age :</label>
         </div>
             input and label are sibling:
         //label[text()='enter your age :']/preceding-sibling::input
         //input[@name='age']/fallowing-sibling::label
      8.cssSelector
  . ==>mean -class name Expl:<div class="col-sm-8">
                         ==> .col-sm-8   find by classname
  # ==>mean -id==> Exp: <div id="page-footer" class="row">
                      ==>  #page-footer  find by id

  css Selector:similar the xpath==>   tagname[attribute='value'],  xPath    :   ==> //tagname[@attribute='value']
    a.)Contains:* star symbol
      tagname[attribute*='value']
    b.)Start with : ^ Symbol
       tagname[attribute^='val'],  tagname[id^='button_']
    c.)Ends -with: $ dollar symbol:
       tagname[attribute$='lue']
    Extra notes:
       CssSelector: button[class="btn btn-primary"]:nth=of-type(2)
       xPath  :   //button[@class="btn btn-primary"][2]
       :nth=of-type(2) -->where n is an index
       interview questions in terms of locators:
       -what are the locators
       =build a locator for web table
       -relative vs ablolute xpath
       -which locator to use? xpath or css and why?
       how to hadle dynamic element?(xpath)
       unbalanced web table? how to hadle?


     */




         }
