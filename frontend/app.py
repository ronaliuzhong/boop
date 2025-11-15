import streamlit as st

# Sidebar navigation
st.sidebar.title("Navigation")
page = st.sidebar.radio("Go to", ["Home", "Locations", "Add Friends", "View Chats", "Classes"])

# Page rendering
if page == "Home":
    st.title("Welcome to the Home Page")
    st.write("This is your main dashboard.")

elif page == "Locations":
    st.title("Locations")
    st.write("Here are the available locations...")

elif page == "Add Friends":
    st.title("Add Friends")
    name = st.text_input("Enter friend's name:")
    if st.button("Add"):
        st.success(f"{name} added!")

elif page == "View Chats":
    st.title("Chats")
    st.write("Your recent conversations will appear here.")

elif page == "Classes":
    st.title("Classes")
    st.write("Here are some classes you can join:")
    classes = ["Math 101", "Philosophy of Ethics", "Data Science"]
    selected_class = st.selectbox("Choose a class:", classes)
    if st.button("Join Class"):
        st.success(f"You joined {selected_class}!")
