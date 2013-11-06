/*******************************************************************************
 * The MIT License
 * 
 * Copyright (c) 2008 Adam Kiezun
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 ******************************************************************************/
package hampi.grammars.apps;

import hampi.grammars.*;

import java.util.List;

/**
 * Collects option, star and plus elements. Used when we want to remove such
 * elements for simplification.
 */
class OptionPlusStarCollector extends GrammarVisitor{
  private final List<GrammarProductionElement> m_acc;

  public OptionPlusStarCollector(List<GrammarProductionElement> acc){
    m_acc = acc;
  }

  @Override
  public boolean visitPlusElement(PlusElement pe){
    m_acc.add(pe);
    return true;
  }

  @Override
  public boolean visitStarElement(StarElement se){
    m_acc.add(se);
    return true;
  }

  @Override
  public boolean visitOptionElement(OptionElement oe){
    m_acc.add(oe);
    return true;
  }
}