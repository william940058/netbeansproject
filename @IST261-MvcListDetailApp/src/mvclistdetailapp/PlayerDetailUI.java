package mvclistdetailapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author macbookpro
 */
public class PlayerDetailUI extends JFrame {

    private int indexOfItemToDisplay;

    private final JTextField detailDisplayValue = new JTextField(15);

    private JPanel instrumentPanel;
    private JPanel buttonPanel;
    private MyModel model;
    private JTable table;

    private final PlayerCntl playerCntl;

    public PlayerDetailUI(PlayerCntl playerCntl, int startingIndexOfDisplay) {
        this.playerCntl = playerCntl;
        indexOfItemToDisplay = startingIndexOfDisplay;
        initComponents();
        setFieldView();
    }

    private void initComponents() {
        setTitle("Detail Player Viewer");
        setSize(500, 250);
        setLocationRelativeTo(null);  // center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(4, 1));
        instrumentPanel.add(new JLabel("Player Detail"));
        instrumentPanel.add(detailDisplayValue);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton previousButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton newButton = new JButton("New");
        JButton deleteButton = new JButton("Delete");
        JButton editButton = new JButton("edit");
        JButton exitButton = new JButton("Exit");

        previousButton.addActionListener(event -> showPreviousPlayer());
        nextButton.addActionListener(event -> showNextPlayer());
        newButton.addActionListener(event -> playerCntl.addNewPlayer());
        deleteButton.addActionListener(event -> playerCntl.deletePlayer(indexOfItemToDisplay));
        editButton.addActionListener(event -> playerCntl.editPlayer(indexOfItemToDisplay));
        exitButton.addActionListener(event -> showExitPlayer());

        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(newButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);
        buttonPanel.add(exitButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        table = new JTable(model = new MyModel());

        JButton add = new JButton("add row");
        add.addActionListener(getAddListener());
        JButton remove = new JButton("remove row");
        remove.addActionListener(getRemoveListener());
        JButton addC = new JButton("add column");
        addC.addActionListener(getAddColListener());
        JButton removeC = new JButton("remove column");
        removeC.addActionListener(getRemoveColListener());
        add(new JScrollPane(table));
        JPanel p = new JPanel();
        p.add(add);
        p.add(remove);
        p.add(addC);
        p.add(removeC);
        add(p, BorderLayout.SOUTH);

    }

    private ActionListener getRemoveColListener() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedColumn = table.getSelectedColumn();
                if (selectedColumn != -1) {
                    stopEditing();
                    model.removeColumn(selectedColumn);
                }
            }
        };
    }

    private ActionListener getAddColListener() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                model.addColumn();
            }
        };
    }

    private ActionListener getRemoveListener() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    stopEditing();
                    model.removeRow(selectedRow);
                }
            }

        };
    }

    private ActionListener getAddListener() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow();
            }
        };
    }

    private void stopEditing() {
        TableCellEditor cellEditor = table.getCellEditor();
        if (cellEditor != null) {
            cellEditor.stopCellEditing();
        }
    }

    private class RowData {

        private Map<Integer, Object> values = new HashMap<Integer, Object>();

        public Object getValueForCol(int columnIndex) {
            if (values.containsKey(columnIndex)) {
                return values.get(columnIndex);
            }
            return "";
        }

        public void setValueForCol(Object aValue, int columnIndex) {
            values.put(columnIndex, aValue);
        }

    }

    private class MyModel extends AbstractTableModel {

        int colIndex = 0;
        private List<Integer> cols = new ArrayList<Integer>();
        private List<RowData> rows = new ArrayList<PlayerDetailUI.RowData>();

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        @Override
        public String getColumnName(int column) {
            return cols.get(column).toString();
        }

        @Override
        public int getRowCount() {
            return rows.size();
        }

        public void addRow() {
            rows.add(new RowData());
            fireTableRowsInserted(rows.size(), rows.size());
        }

        public void removeRow(int selectedRow) {
            rows.remove(selectedRow);
            fireTableRowsDeleted(selectedRow, selectedRow);
        }

        public void removeColumn(int selectedColumn) {
            cols.remove(table.convertColumnIndexToModel(selectedColumn));
            fireTableStructureChanged();
        }

        public void addColumn() {
            cols.add(++colIndex);
            fireTableStructureChanged();
        }

        @Override
        public int getColumnCount() {
            return cols.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            RowData rowData = rows.get(rowIndex);
            return rowData.getValueForCol(cols.get(columnIndex));
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            RowData rowData = rows.get(rowIndex);
            rowData.setValueForCol(aValue, cols.get(columnIndex));
            fireTableCellUpdated(rowIndex, columnIndex);
        }

    }

    private void showNextPlayer() {
        int listSize = playerCntl.getPlayerList().getListOfPlayers().size();
        if (indexOfItemToDisplay == listSize - 1) {
            this.indexOfItemToDisplay = 0;
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
            setFieldView();
        } else {
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay++);
            setFieldView();
        }
    }

    private void showPreviousPlayer() {
        int listSize = playerCntl.getPlayerList().getListOfPlayers().size();
        if (indexOfItemToDisplay == 0) {
            this.indexOfItemToDisplay = listSize - 1;
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
            setFieldView();

        } else {
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay--);
            setFieldView();
        }

    }

    private void showExitPlayer() {
        System.exit(0);
    }

    private void setFieldView() {
        detailDisplayValue.setText(playerCntl.getDetail(indexOfItemToDisplay).getDetail());

    }

    public String editDetail() {
        return detailDisplayValue.getText();
    }

    void refreshDisplayWithNewValues(int index) {
        boolean done = false;
        while (!done) {
            try {
                if (indexOfItemToDisplay == index - 1) {
                    this.indexOfItemToDisplay = 0;
                    playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
                    setFieldView();
                } else {
                    playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay++);
                    setFieldView();
                }
                done = true;
            } catch (IndexOutOfBoundsException e) {
                this.indexOfItemToDisplay = 0;
            }
        }
    }
}
