import ttkbootstrap as ttk
from ttkbootstrap.constants import *

class TravelExpenseForm(ttk.Toplevel):
    def __init__(self, master):
        super().__init__(master)
        self.title("差旅报销单")
        self.geometry("800x600")

        # Create a frame for the form
        form_frame = ttk.Frame(self, padding="10")
        form_frame.pack(fill=BOTH, expand=True)

        # Form fields based on travelexpense.png
        fields = [
            ("制单日期", "date"), ("单据编号", "text"), ("报销人", "text"),
            ("出差事由", "textarea"), ("项目", "text"), ("是否有借款", "radio"),
            ("开始日期", "date"), ("结束日期", "date"), ("出差人数", "number"),
            ("出发地点", "text"), ("到达地点", "text"), ("交通工具", "text"),
            ("住宿费", "number"), ("伙食补贴", "number")
        ]

        for i, (label_text, field_type) in enumerate(fields):
            label = ttk.Label(form_frame, text=label_text)
            label.grid(row=i, column=0, padx=5, pady=5, sticky=W)

            if field_type == "textarea":
                entry = ttk.Text(form_frame, height=2, width=30)
            elif field_type == "radio":
                entry = ttk.Frame(form_frame)
                ttk.Radiobutton(entry, text="是", value="yes").pack(side=LEFT, padx=5)
                ttk.Radiobutton(entry, text="否", value="no").pack(side=LEFT, padx=5)
            elif field_type == "date":
                entry = ttk.DateEntry(form_frame, bootstyle="primary")
            elif field_type == "number":
                 entry = ttk.Entry(form_frame, width=30)
            else:
                entry = ttk.Entry(form_frame, width=30)

            entry.grid(row=i, column=1, padx=5, pady=5, sticky=W)

        # Submit button
        submit_button = ttk.Button(form_frame, text="提交", bootstyle=SUCCESS)
        submit_button.grid(row=len(fields), column=0, columnspan=2, pady=10)


def open_travel_expense_form():
    TravelExpenseForm(root)

def open_car_fee_form():
    CarFeeForm(root)

class CarFeeForm(ttk.Toplevel):
    def __init__(self, master):
        super().__init__(master)
        self.title("公务车运行维护报销单")
        self.geometry("800x600")

        # Create a frame for the form
        form_frame = ttk.Frame(self, padding="10")
        form_frame.pack(fill=BOTH, expand=True)

        # Form fields based on carfee.png
        fields = [
            ("制单日期", "date"), ("单据编号", "text"), ("报销人", "text"),
            ("报销事由", "textarea"), ("项目", "text"),
            ("是否有用款审批单", "radio"), ("是否大额", "radio"), ("是否有借款", "radio"),
            ("票据张数", "number"), ("报销金额", "number"), ("车牌号", "text")
        ]

        for i, (label_text, field_type) in enumerate(fields):
            label = ttk.Label(form_frame, text=label_text)
            label.grid(row=i, column=0, padx=5, pady=5, sticky=W)

            if field_type == "textarea":
                entry = ttk.Text(form_frame, height=2, width=30)
            elif field_type == "radio":
                entry = ttk.Frame(form_frame)
                ttk.Radiobutton(entry, text="是", value="yes").pack(side=LEFT, padx=5)
                ttk.Radiobutton(entry, text="否", value="no").pack(side=LEFT, padx=5)
            elif field_type == "date":
                entry = ttk.DateEntry(form_frame, bootstyle="primary")
            elif field_type == "number":
                entry = ttk.Entry(form_frame, width=30)
            else:
                entry = ttk.Entry(form_frame, width=30)

            entry.grid(row=i, column=1, padx=5, pady=5, sticky=W)

        # Submit button
        submit_button = ttk.Button(form_frame, text="提交", bootstyle=SUCCESS)
        submit_button.grid(row=len(fields), column=0, columnspan=2, pady=10)

# Create the main window
root = ttk.Window(themename="litera")
root.title("报销系统")
root.geometry("400x200")

# Create a frame for the buttons
frame = ttk.Frame(root, padding="20")
frame.pack(expand=True, fill=BOTH)

# Create the buttons
travel_button = ttk.Button(
    frame,
    text="差旅报销",
    command=open_travel_expense_form,
    bootstyle=SUCCESS
)
travel_button.pack(pady=10, fill=X)

car_button = ttk.Button(
    frame,
    text="公务车报销",
    command=open_car_fee_form,
    bootstyle=INFO
)
car_button.pack(pady=10, fill=X)

# Start the main loop
root.mainloop()
