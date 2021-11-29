# Note that Graphviz must be installed on your python framework (laptop) using pip3 install command below:
# pip3 install pygraphviz
import pygraphviz as pgv
import sys
from PIL import Image
def visualize(ls):
    # Traverse through a list and add elements/visualize tree ...
    tree = pgv.AGraph(strict=True, directed=True)
    tree.graph_attr["rankdir"] = "TB"
    tree.graph_attr["ordering"] = "out"
    tree.node_attr["shape"] = "circle"
    tree.node_attr["style"] = "filled"
    tree.node_attr["fontcolor"] = "white"
    tree.layout(prog="dot")
    for i in range(len(ls)):
        tree.add_node(ls[i], color="red")
    for j in range(len(ls)):
        if ((2*j + 1) < len(ls)):
            tree.add_edge(ls[j], ls[(2*j +1)])
        if ((2*j + 2) < len(ls)):
            tree.add_edge(ls[j], ls[(2*j +2)])
    return tree
if __name__ == "__main__":
    ls = [7,2,11,1,5,8,14,4,15]
    tree = visualize(ls)
    tree.write("tree.dot")  # write to simple.dot
    tree.draw("tree.png", prog="dot")
    img = Image.open("tree.png")
    img.show()
    sys.exit()
